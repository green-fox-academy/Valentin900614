package main.java.music;

public abstract class StringedInstruments extends Instrument{

    int numberOfStrings;
    abstract void sound();

    @Override
    public void play() {
        sound();
    }

}
