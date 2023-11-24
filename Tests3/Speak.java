package Tests3;

interface Tone{
    void up();
}
public class Speak {
    public static void main(String[] args) {
        Speak s = new GoodSpeak();
        //invalid
        /*  s.up();
        (Tone)(GoodSpeak)s.up();      ==>> valid ((Tone)(GoodSpeak)s).up()
        (GoodSpeak)s.up();
         */
        ((Tone)s).up();
        ((GoodSpeak)s).up();
    }
}
class GoodSpeak extends Speak implements Tone{
    public void up(){
        System.out.println("UP UP UP");
    }
}
