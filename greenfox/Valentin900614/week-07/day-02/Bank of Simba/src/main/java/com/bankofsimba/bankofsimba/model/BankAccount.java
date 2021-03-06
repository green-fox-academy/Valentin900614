package com.bankofsimba.bankofsimba.model;

public class BankAccount {

    private String name;
    private int balance;
    private String animalType;
    private boolean king;
    private boolean goodGuy;

    public BankAccount() {
        king = false;
        goodGuy = true;
    }

    public BankAccount(String name, int balance, String animalType, boolean king, boolean goodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.goodGuy = goodGuy;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return king;
    }

    public boolean isGoodGuy() {
        return goodGuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public void setGoodGuy(boolean goodGuy) {
        this.goodGuy = goodGuy;
    }

    public void raiseBalance() {
        if (this.isKing()) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }
    }
}
