package com.company.Entity;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class Passanger implements PassangerId {

    private String name;
    private String sureName;
    private int age;


    public void checkDocument(List<Passanger> passangerList) {

    }

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
