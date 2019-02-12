package garden;

public class Flower extends Garden {

    public Flower (int water, String name) {
        super.water = water;
        super.name = name;

        if (water < 5)
            super.needToBeWatered = true;
        else
            super.needToBeWatered = false;
    }

}
