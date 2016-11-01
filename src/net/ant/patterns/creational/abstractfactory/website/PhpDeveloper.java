package net.ant.patterns.creational.abstractfactory.website;

import net.ant.patterns.creational.abstractfactory.Developer;

/**
 * Created by user on 01.11.2016.
 */
public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("PhpDevelopers writes php code...");
    }
}
