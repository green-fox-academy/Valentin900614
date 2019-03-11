package com.greenfoxacademy.hundredacrewood.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InhabitantList {

    private List<Inhabitant> inhabitants;

    public InhabitantList() {
        this.inhabitants = new ArrayList<>();
        initiallizeList();
    }

    private void initiallizeList() {
        inhabitants.add(new Inhabitant("Micimacko", 5, Gender.MALE));
        inhabitants.add(new Inhabitant("Malacka", 4, Gender.MALE));
    }

    public List<Inhabitant> getInhabitants() {
        return inhabitants;
    }

    public Inhabitant filterById (int id) {
        for (Inhabitant inhabitant : inhabitants) {
            if (inhabitant.getId() == id)
                return inhabitant;
        }
        return null;
    }

    public void addNewInhabitant (Inhabitant inhabitant) {
        inhabitants.add(inhabitant);
    }
}
