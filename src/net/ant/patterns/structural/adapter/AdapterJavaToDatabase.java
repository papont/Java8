package net.ant.patterns.structural.adapter;

/**
 * Created by user on 02.11.2016.
 */
public class AdapterJavaToDatabase extends JavaApp implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
