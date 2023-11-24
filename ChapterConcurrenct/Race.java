package ChapterConcurrenct;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//q18
//execute() uses method but it has a callable lambda inside.
public class Race {
    ExecutorService service =
            Executors.newFixedThreadPool(8);
    static int counter;

    public static int sleep() {
        try {
            counter++;
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception sleep");
        }
        System.out.println("inside sheep "+counter);
        return counter;
    }

    public static void main(String[] p) throws Exception {
        var race = new Race();
        race.service.execute(() -> race.hare());
        race.service.execute(() -> race.tortoise());
    }

    public void hare() {
        try {
            Callable<Integer> c = () -> sleep();
            final var r = List.of(c, c, c);
            var results = service.invokeAll(r);
//            var results2 = service.invokeAll(null);    //valid
            Future<Integer> printval = results.get(2);
            int val = printval.get();
            System.out.println("val in hare "+val);
            System.out.println("Hare won the race!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tortoise() {
        try {
            Callable<Integer> c = () -> sleep();
            final var r = List.of(c, c, c);
            Integer result = service.invokeAny(r);
//            Integer res12 = service.invokeAny(null);
            System.out.println("val in tortoice "+result);
            System.out.println("Tortoise won the race!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
