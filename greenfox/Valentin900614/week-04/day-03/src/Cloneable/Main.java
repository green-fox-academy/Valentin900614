package Cloneable;

public class Main {
    public static void main(String[] args) {

        Student john = new Student("John", 20, "male", "BME");

        john.introduce();
        john.getGoal();

        Student johnTheClone = new Student();

        try {
            johnTheClone = john.clone();
        } catch (Exception e) {
            System.err.println("error");
        }

        johnTheClone.introduce();
        johnTheClone.getGoal();

    }

}
