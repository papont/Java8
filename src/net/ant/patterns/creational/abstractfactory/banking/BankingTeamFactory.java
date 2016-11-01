package net.ant.patterns.creational.abstractfactory.banking;

import net.ant.patterns.creational.abstractfactory.Developer;
import net.ant.patterns.creational.abstractfactory.ProjectManager;
import net.ant.patterns.creational.abstractfactory.ProjectTeamFactory;
import net.ant.patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
