package com.greenfoxacademy.hundredacrewood.model;

public class Inhabitant {

    private static int nextID = 0;

    private int id;
    private String name;
    private Integer age;
    private Gender gender;

    public Inhabitant(String name, Integer age, Gender gender) {
        this.id = nextID++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
