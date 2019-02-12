package garden;

public class Garden {

    int water;
    boolean needToBeWatered;
    String name;
    public static double flowerWaterintPercentage = 0.75;
    public static double treeWateringPercentage = 0.4;

    public Garden (String name) {
        this.name = name;
    }

    public Garden () {

    }

    public void info () {
        if (this.needToBeWatered)
            System.out.println("The " + this.name + " " + this.getClass().toString().substring(13) + " needs water");
        else
            System.out.println("The " + this.name + " " + this.getClass().toString().substring(13) + " does not need water");
    }
}
