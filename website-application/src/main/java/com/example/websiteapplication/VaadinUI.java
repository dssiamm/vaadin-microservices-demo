package com.example.websiteapplication;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Alejandro Duarte.
 */
@SpringUI(path = "/")
public class VaadinUI extends UI {

    @Value("${news-application.url}")
    private String newsUrl;

    @Value("${admin-application.url}")
    private String adminUrl;

    @Value("${registryapplication-application.url}")
    private String registryUrl;

    @Value("${ui.split.position:30}")
    private int uiSplitPosition;

    @Override
    protected void init(VaadinRequest request) {
        getReconnectDialogConfiguration().setDialogText("Please wait...");
        getReconnectDialogConfiguration().setReconnectInterval(1000);

        BrowserFrame news = new BrowserFrame("News", new ExternalResource(newsUrl));
        news.setSizeFull();

        BrowserFrame admin = new BrowserFrame("Admin", new ExternalResource(adminUrl));
        admin.setSizeFull();

        BrowserFrame registry = new BrowserFrame("Registry", new ExternalResource(registryUrl));
        registry.setSizeFull();

//        HorizontalLayout layout = new HorizontalLayout();
//        layout.add
        HorizontalSplitPanel mainLayout = new HorizontalSplitPanel(registry, news);
        mainLayout.setSplitPosition(uiSplitPosition);
        mainLayout.setSizeFull();

        setContent(mainLayout);
    }

}
