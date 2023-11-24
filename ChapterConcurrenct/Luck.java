package ChapterConcurrenct;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class Luck {
    private AtomicBoolean coin = new AtomicBoolean(false);

    public static void main(String[] gamble) throws
            Exception {
        var luck = new Luck();
        ExecutorService s = Executors.newCachedThreadPool();
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            s.execute(() -> luck.flip());
            count++;
        }
        s.shutdown();
//        Thread.sleep(5000);
        System.out.println(count);
        System.out.println(luck.coin.get());
    }

    void flip() {
        coin.getAndSet(!coin.get());
    }
}
