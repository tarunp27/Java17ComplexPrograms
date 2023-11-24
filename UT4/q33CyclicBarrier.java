package UT4;

import java.util.concurrent.CyclicBarrier;

public class q33CyclicBarrier {
    public static void main(String[] args) throws Exception{
        var m = new Merger();
        //LINE 3
        CyclicBarrier cb = new CyclicBarrier(2, m);
        var ip = new ItemProcessor(cb);
//        new Thread(ip).start(); //LINE 4
//        new Thread(ip).start(); //LINE 4
        ip.start();
        cb.await();
        System.out.println("Process completed");
    }
}

class ItemProcessor extends Thread implements Runnable{  //LINE 1
    CyclicBarrier cb;
    public ItemProcessor(CyclicBarrier cb){
        this.cb = cb;
    }
    public void run(){
        try {
            System.out.println(getName()+" got lock. "+getState());
            cb.await();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(" ip process completed");
    }
}

class Merger implements Runnable{ //LINE 2
    public void run(){
        System.out.println("Value Merged");
    }
}


