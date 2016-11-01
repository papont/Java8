package net.ant.patterns.creational.abstractfactory.website;

import net.ant.patterns.creational.abstractfactory.Developer;
import net.ant.patterns.creational.abstractfactory.ProjectManager;
import net.ant.patterns.creational.abstractfactory.ProjectTeamFactory;
import net.ant.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
