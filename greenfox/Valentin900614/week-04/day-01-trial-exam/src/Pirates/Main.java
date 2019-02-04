package Pirates;

public class Main {
    public static void main(String[] args) {

        Pirate pirate1 = new Pirate("Valami", 20, 20, true, true);
        Pirate pirate2 = new Pirate("Valaki", 5, 10, false, false);

        System.out.println(pirate1.gold);
        System.out.println(pirate1.healthPoints);
        System.out.println(pirate2.gold);
        System.out.println(pirate2.healthPoints);

        pirate1.doesHaveWoodenLeg(pirate1.woodenLeg);
        pirate2.doesHaveWoodenLeg(pirate2.woodenLeg);

        pirate1.party(pirate1.captain);
        pirate1.work(pirate1.captain);
        pirate2.party(pirate2.captain);
        pirate2.work(pirate2.captain);

        System.out.println(pirate1.gold);
        System.out.println(pirate1.healthPoints);
        System.out.println(pirate2.gold);
        System.out.println(pirate2.healthPoints);

    }
}
