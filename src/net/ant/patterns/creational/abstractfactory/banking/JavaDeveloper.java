package net.ant.patterns.creational.abstractfactory.banking;

import net.ant.patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
