package org.example.model;

public class User {

    private int id;
    private  String name;


    public User(String name, int id) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
