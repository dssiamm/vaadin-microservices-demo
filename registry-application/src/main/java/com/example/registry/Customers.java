package com.example.registry;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import com.mongodb.client.model.Sorts;
import java.util.Arrays;
import org.bson.Document;

import java.io.Serializable;

public class Customers implements Serializable {

    private static MongoClient mongoClient;
    private static MongoDatabase registeredCustomers;
    private static MongoCollection<Document> collection;

    public static void connect() throws Exception {
        mongoClient = new MongoClient(
                new MongoClientURI("mongodb://127.0.0.1:27000,127.0.0.1:27001,127.0.0.1:27002"));

        registeredCustomers = mongoClient.getDatabase("Customers");

        collection = registeredCustomers.getCollection("Registered");
    }

    public static boolean isRegistered(String login, String password) throws Exception {
        BasicDBObject whereQuery = new BasicDBObject();

        whereQuery.put("name", login);
        whereQuery.put("password", password);

        DBCursor cursor = collection.find(whereQuery);
        if(cursor.hasNext())
            return true;

        return false;
    }

    public static boolean registerClient(String login, String password) throws Exception {
        BasicDBObject document = new BasicDBObject();

        if(isRegistered(login, password))
            return true;

        document.put("name", login);
        document.put("password", password);

        try {
            collection.insert(document);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public String[] findAllUsers() {
        Block<Document> printBlock = new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        };

        collection.find().forEach(printBlock);

    }

}
