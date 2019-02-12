package garden;

import java.util.ArrayList;
import java.util.List;

import static garden.Garden.flowerWaterintPercentage;
import static garden.Garden.treeWateringPercentage;

public class Main {
    public static void main(String[] args) {

        List<Garden> garden = new ArrayList<>();

        Flower yellow = new Flower(3, "yellow");
        garden.add(yellow);
        Flower blue = new Flower(3, "blue");
        garden.add(blue);
        Tree purple = new Tree(2, "purple");
        garden.add(purple);
        Tree orange = new Tree(2, "orange");
        garden.add(orange);

        listInfo(garden);

        int watering = 40;

        System.out.println();
        System.out.println("Watering with " + watering);

        double waterPerPlant = (double)watering/numberOfWaterablePlants(garden);

        wateringByClass(garden, waterPerPlant);

        listInfo(garden);

        watering = 70;

        System.out.println();
        System.out.println("Watering with " + watering);

        waterPerPlant = (double)watering/numberOfWaterablePlants(garden);

        wateringByClass(garden, waterPerPlant);

        listInfo(garden);

    }

    private static void listInfo (List<Garden> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).info();
        }
    }

    private static int numberOfWaterablePlants (List<Garden> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).needToBeWatered)
                sum++;
        }
        return sum;
    }

    private static void wateringByClass (List<Garden> list, double water) {
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i).getClass().toString();
            if (a.contains("Flower")) {
                double b = flowerWaterintPercentage * water;
                list.get(i).water += b;
                if (list.get(i).water < 5)
                    list.get(i).needToBeWatered = true;
                else
                    list.get(i).needToBeWatered = false;
            } else {
                double b = treeWateringPercentage * water;
                list.get(i).water += b;
                if (list.get(i).water < 10)
                    list.get(i).needToBeWatered = true;
                else
                    list.get(i).needToBeWatered = false;
            }
        }
    }

}
