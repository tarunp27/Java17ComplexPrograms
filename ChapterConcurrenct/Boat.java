package ChapterConcurrenct;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

//q30
//cyclic barrier
public class Boat {
    public static void main(String[] oars) {
        ExecutorService service = null;
        try {
            service = Executors.newCachedThreadPool();
            new Boat().row(service);
        } finally {
//            service.isShutdown();
            service.shutdown();
        }
    }

    private void waitTillFinished(CyclicBarrier c) {
        try {
            c.await();
            System.out.print("W");
        } catch (Exception e) {
        }
    }

    public void row(ExecutorService s) {
        var cb = new CyclicBarrier(5);
        IntStream.iterate(1, i -> i + 1)
                .limit(12)                    //limit(15) will work
                .forEach(i -> s.submit(() ->
                        waitTillFinished(cb)));
    }
}
