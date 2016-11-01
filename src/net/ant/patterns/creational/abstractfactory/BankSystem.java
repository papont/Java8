package net.ant.patterns.creational.abstractfactory;

import net.ant.patterns.creational.abstractfactory.banking.BankingTeamFactory;

/**
 * Created by user on 01.11.2016.
 */
public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();    }
}
