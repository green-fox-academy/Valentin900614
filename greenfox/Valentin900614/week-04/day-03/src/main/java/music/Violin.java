package main.java.music;

public class Violin extends StringedInstruments {

    public Violin() {
        super.numberOfStrings = 4;
    }

    @Override
    void sound() {
        System.out.println("Violin, a " + super.numberOfStrings + "-stringed instrument that goes Screech");
    }
}
