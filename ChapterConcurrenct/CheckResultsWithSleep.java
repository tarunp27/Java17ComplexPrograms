package ChapterConcurrenct;

public class CheckResultsWithSleep {
    private static int counter = 0;

    public static void main(String[] a) {
        final var mainThread = Thread.currentThread();

        new Thread(() ->
        {
            //mainThread.interrupt();
            for (int i = 0; i < 1_000_000; i++) counter++;
            System.out.println("1"+mainThread.getState());
        }).start();

        while (counter < 1_000_000) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1000); // 1 SECOND
                System.out.println("2"+mainThread.getState());
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: " + counter);
    }
}
