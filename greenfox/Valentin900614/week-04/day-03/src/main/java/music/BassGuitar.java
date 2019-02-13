package main.java.music;

public class BassGuitar extends StringedInstruments{

    public BassGuitar() {
        super.numberOfStrings = 4;
    }

    public BassGuitar(int strings) {
       super.numberOfStrings = strings;
    }

    @Override
    void sound() {
        System.out.println("Bass Guitar, a " + super.numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
    }
}
