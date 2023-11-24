package Test8;

public class Q14_Overriding {
}
class Game{
    public void play()throws Exception{
        System.out.println("Playing...");
    }
}

class Soccer extends Game{
    public void play(){
        System.out.println("Playing Soccer...");
    }
    public static void main(String[] args){
        //Game g = new Soccer();
        Soccer s = new Soccer();
        s.play();
    }
}