package Chapter8;

public class Speaking extends Thread{
    void talk() {
        try {
            Thread.sleep(10_000);
            System.out.println("Hello");
        } catch (InterruptedException e) {
            System.out.println("How rude!");
        } }
    public static void main(String[] args) {
        var s = new Speaking();
        var t = new Thread(() -> s.talk());
        t.start();
        t.interrupt();
        t.interrupt();
        t.interrupt();
    } }

