package Test2;

class ClassThread1 extends Thread{
    boolean flag = true;
    public void run(){
        System.out.println("Starting loop");
        while (!isInterrupted()) {};

//        while (flag) {
//            System.out.print("hi ");
//        }
        System.out.println("Ending loop");
    }
}

public class Question9 {
    public static void main(String[] args) throws InterruptedException {
        ClassThread1 ct = new ClassThread1();
        ct.start();
        System.out.println("Waiting 5 seconds before interrupt");
        Thread.sleep(5000);
        ct.interrupt();
    }
}

