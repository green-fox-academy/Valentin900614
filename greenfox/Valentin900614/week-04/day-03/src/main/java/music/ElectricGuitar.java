package main.java.music;

public class ElectricGuitar extends StringedInstruments {

    public ElectricGuitar() {
        super.numberOfStrings = 6;
    }

    public ElectricGuitar(int strings) {
        super.numberOfStrings = strings;
    }

    @Override
    public void sound() {
        System.out.println("Electric Guitar, a " + super.numberOfStrings + "-stringed instrument that goes Twang");
    }

}
