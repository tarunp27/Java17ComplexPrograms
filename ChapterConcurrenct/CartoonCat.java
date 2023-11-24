package ChapterConcurrenct;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class CartoonCat {
    private void firstMethdods() { System.out.println("method1"); }
    private void secondtMethods() { System.out.println("method2"); }

    public static void main(String... strings) throws BrokenBarrierException, InterruptedException {
        new CartoonCat().march(new CyclicBarrier(5,
                () -> System.out.println("Ready")));
    }

    private void await(CyclicBarrier c) {
        try {
            firstMethdods();
            c.await();
            secondtMethods();
            c.await();
        } catch (Exception e) {
        }
    }

    public void march(CyclicBarrier c) throws BrokenBarrierException, InterruptedException {
        var s = Executors.newCachedThreadPool();
        for (int i = 0; i < 12; i++) {
            s.execute(()-> await(c));
        }
        s.shutdown();
    }
}
