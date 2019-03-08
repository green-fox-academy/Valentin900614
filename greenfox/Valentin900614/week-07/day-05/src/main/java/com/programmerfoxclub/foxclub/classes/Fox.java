package com.programmerfoxclub.foxclub.classes;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> listOfTricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
        food = "";
        drink = "";
    }

    public Fox(String name, List<String> listOfTricks, String food, String drink) {
        this.name = name;
        this.listOfTricks = listOfTricks;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setListOfTricks(List<String> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }
}
