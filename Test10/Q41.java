package Test10;

class Game{
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}

class Soccer extends Game{
    public void play(String ball) {
        System.out.println("Playing soccor "+ball);
    }
}

public class Q41 {
    public static void main(String[] args) {
        Game g = new Game();
        Soccer s = (Soccer) g;

        try {
            g.play();
        }catch (Exception e){}

        s.play("Brazil");

    }
}
