package net.ant.patterns.creational.abstractfactory.website;

import net.ant.patterns.creational.abstractfactory.Tester;

/**
 * Created by user on 01.11.2016.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester tests website...");
    }
}
