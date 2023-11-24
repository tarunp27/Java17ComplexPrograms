package ChapterConcurrenct;

public class MyClass implements Runnable {
    public void run(){
        System.out.println("Thread started");
    }
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Thread job = new Thread(mc);
        job.start();
//        new Thread(mc).start();
        System.out.println("Process ended");
    }
}
