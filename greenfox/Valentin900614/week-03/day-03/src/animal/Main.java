package animal;

public class Main {
    public static void main(String[] args) {

        Animal tiger = new Animal();
        tiger.drink();
        tiger.eat();

        tiger.play();
        tiger.play();
        System.out.println(tiger.hunger + " " + tiger.thirst);

    }
}
