package net.ant.patterns.creational.builder;

public abstract class WebSiteBuilder {
    WebSite webSite;

    public void createWebSite() {
        this.webSite = new WebSite();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    public WebSite getWebSite(){
        return webSite;
    }
}
