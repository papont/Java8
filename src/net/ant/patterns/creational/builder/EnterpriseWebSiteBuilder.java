package net.ant.patterns.creational.builder;

/**
 * Created by user on 03.11.2016.
 */
public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10_000_000);
    }
}
