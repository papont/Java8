package net.ant.patterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite = director.builsWebSite();
        System.out.println(webSite);

    }
}
