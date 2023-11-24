package Test11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class MyCallable implements Callable<String>{
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Done";
    }
}
public class Q46_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var es = Executors.newSingleThreadExecutor();
        var future =es.submit(new MyCallable());
        System.out.println(future.get());
        es.shutdown();
    }
}
