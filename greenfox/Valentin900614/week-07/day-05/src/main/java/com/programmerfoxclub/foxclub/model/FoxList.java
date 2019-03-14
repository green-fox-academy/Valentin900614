package com.programmerfoxclub.foxclub.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxList {

    private List<Fox> foxes;

    public FoxList() {
        foxes = new ArrayList<>();
        initializeFoxList();
    }

    private void initializeFoxList() {
        List<String> tricks1 = new ArrayList<>(Arrays.asList("fetch", "dance"));
        List<String> tricks2 = new ArrayList<>(Arrays.asList("dance", "swim", "hunt", "fool around", "cuddle"));
        this.foxes.add(new Fox("Liza", tricks1, "salmon", "water"));
        this.foxes.add(new Fox("Green", new ArrayList<>(), "salad", "blood"));
        this.foxes.add(new Fox("Vuk", tricks2, "chicken", "milk"));
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void addFox(Fox fox) {
        foxes.add(fox);
    }

    public boolean existFox(String name) {
        return findFox(name) != null;
    }

    public Fox findFox(String name) {
        Fox fox = foxes.stream()
                .filter(f -> f.getName().equals(name))
                .findFirst()
                .orElse(null);
        return fox;
    }

}
