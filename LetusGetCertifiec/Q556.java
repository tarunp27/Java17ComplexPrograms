package LetusGetCertifiec;

class Game { }
class Cricket extends Game { }

class Instrument { }
class Guitar extends Instrument { }


interface Player  {
    void play(Double e);
}

//interface GamePlayer extends Player { }

interface MusicPlayer<E extends Instrument> extends Player { }

class Batsman <E> implements Player{
    public void play(Double o){ }
}

public class Q556 {


}
