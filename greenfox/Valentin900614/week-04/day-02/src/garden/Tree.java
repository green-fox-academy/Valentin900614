package garden;

public class Tree extends Garden {

    public Tree (int water, String name) {
        super.water = water;
        super.name = name;

        if (water < 10)
            super.needToBeWatered = true;
        else
            super.needToBeWatered = false;
    }

}
