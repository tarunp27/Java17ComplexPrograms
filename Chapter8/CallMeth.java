package Chapter8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallMeth extends Thread{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable c = new Callable() {
            public Object call() {
                System.out.print("X");
                return 10;
            }
        };
        var s = Executors.newScheduledThreadPool(1);
        for(int i=0; i<10; i++) {
            Future f = s.submit(c);
            f.get();
        }
        s.shutdown();
        System.out.print("Done!");
    }
}
