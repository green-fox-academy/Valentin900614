package main.java.music;

public class ElectricGuitar extends StringedInstruments {

    public ElectricGuitar() {
        super(6);
    }

    public ElectricGuitar(int strings) {
        super(strings);
    }

    @Override
    public void sound() {
        System.out.println("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes Twang");
    }

}
