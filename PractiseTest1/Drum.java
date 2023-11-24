package PractiseTest1;


interface MakesNoise {
    default void concert(){
        System.out.println("Hello");
    }
}

abstract class Instrument implements MakesNoise {
    Instrument(){}
    public Instrument(int beats) {
    }

    public void play(int i) {
    }
}

public class Drum extends Instrument {
    public static void main(String[] beats) {
        MakesNoise mn = new Drum();
        mn.concert();
    }

    public void play(int count) {
    }

    public void concert() {
        super.play(5);
    }
}