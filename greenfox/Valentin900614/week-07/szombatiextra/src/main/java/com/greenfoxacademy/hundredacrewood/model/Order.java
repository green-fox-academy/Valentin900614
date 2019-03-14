package com.greenfoxacademy.hundredacrewood.model;

public class Order {

    private static int ID = 0;

    private int id;
    private String name;
    private Integer cost;
    private int inhabitantId;

    public Order () {
        id = ID;

    }

    public Order(String name, Integer cost, int inhabitantId) {
        id = ID++;
        this.name = name;
        this.cost = cost;
        this.inhabitantId = inhabitantId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public int getInhabitantId() {
        return inhabitantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setInhabitantId(int inhabitantId) {
        this.inhabitantId = inhabitantId;
    }
}
