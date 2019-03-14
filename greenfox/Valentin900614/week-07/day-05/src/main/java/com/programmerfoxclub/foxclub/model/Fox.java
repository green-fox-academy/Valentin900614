package com.programmerfoxclub.foxclub.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

    private String name;
    private List<String> listOfTricks;
    private String food;
    private String drink;
    private List<String> listOfActions;


    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
        food = "meat";
        drink = "water";
        listOfActions = new ArrayList<>();
    }

    public Fox(String name, List<String> listOfTricks, String food, String drink) {
        this.name = name;
        this.listOfTricks = listOfTricks;
        this.food = food;
        this.drink = drink;
        listOfActions = new ArrayList<>();
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

    public List<String> getListOfActions() {
        return listOfActions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addNewTrick(String trick) {
        this.listOfTricks.add(trick);
    }

    public List<String> findUnknownTricks(List<String> tricksToSearch) {
        return tricksToSearch.stream()
                .filter(t -> !listOfTricks.contains(t))
                .collect(Collectors.toList());
    }

    public void addAction(String action) {
        this.listOfActions.add(action);
    }

    public void addTrick(String trick) {
        this.listOfTricks.add(trick);
    }

}
