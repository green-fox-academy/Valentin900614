package Pirates;

public class Pirate {

    String name;
    int gold;
    int healthPoints;
    boolean captain;
    boolean woodenLeg;

    public Pirate () {
        this.healthPoints = 10;
    }

    public Pirate (String name, int gold, int healthPoints, boolean captain, boolean woodenLeg) {
        this.name = name;
        this.gold = gold;
        this.healthPoints = healthPoints;
        this.captain = captain;
        this.woodenLeg = woodenLeg;
    }

    public void work(boolean captain) {
        if (captain) {
            gold += 10;
            healthPoints -= 5;
        }
            else {
            gold += 1;
            healthPoints -= 1;
        }
    }

    public void party(boolean captain) {
        if (captain)
            healthPoints += 10;
        else
            healthPoints += 1;
    }

    public void doesHaveWoodenLeg(boolean woodenLeg) {
        if (woodenLeg)
            System.out.println("Hello, I am " + name + ". I have a wooden leg and " + gold + " golds.");
        else
            System.out.println("Hello, I am " + name + ". I still have my real legs and " + gold + " golds.");
    }


}
