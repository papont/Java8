package net.ant.patterns.creational.abstractfactory.website;

import net.ant.patterns.creational.abstractfactory.ProjectManager;

/**
 * Created by user on 01.11.2016.
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project...");
    }
}
