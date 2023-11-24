package TextBook.Concurrency;

import java.util.concurrent.*;

public class Q4_Service {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = // w1
                Executors.newSingleThreadScheduledExecutor();
        ((ScheduledExecutorService) service).scheduleWithFixedDelay(() ->
        {
            System.out.println("Open Zoo");
            //return null; // w2
        }, 0, 1, TimeUnit.MINUTES);
        var result = service.submit(() ->
// w3
                System.out.println("Wake Staff"));
        System.out.println(result.get()); // w4
    }
}
