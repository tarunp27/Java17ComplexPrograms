package UT4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class T extends Thread {
    static Lock lock = new ReentrantLock();

    public T(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            if (lock.tryLock()) {
                System.out.println(getName() + " got lock. " + getState());
            } else {
                System.out.println(getName() + " could not get lock. " + getState());
            }
        }
    }
}


public class q52 {
    public static void main(String args[]) throws Exception {
        T t1 = new T("T1");
        T t2 = new T("T2");
        t1.start();
        t2.start();
//        T t3 = new T("T3");
//        t3.start();
//        T t4 = new T("T4");
//        t4.start();
    }
}
