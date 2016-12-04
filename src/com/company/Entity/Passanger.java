package com.company.Entity;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class Passanger {

    private String name;
    private String sureName;
    private int age;
    private Enum<PassangerType> passangerType;

    public Passanger(String name, String sureName, int age, Enum<PassangerType> passangerType) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.passangerType = passangerType;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getAge() {
        return age;
    }

    public Enum<PassangerType> getPassangerType() {
        return passangerType;
    }
}
