package TextBook.ByndClasses;

interface Swim{
    default void perform(){
        System.out.println("Swim!");
    }
}
interface Dance{
    default void perform(){
        System.out.println("Dance!");
    }
}
public class Penguin implements Swim,Dance {
    public void perform() { System.out.print("Smile!"); }
    public void doShow(){
     Swim.super.perform();
    }

    public static void main(String[] args) {
        new Penguin().doShow();
    }

}
