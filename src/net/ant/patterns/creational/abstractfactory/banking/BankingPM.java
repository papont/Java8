package net.ant.patterns.creational.abstractfactory.banking;

import net.ant.patterns.creational.abstractfactory.ProjectManager;

/**
 * Created by user on 01.11.2016.
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
