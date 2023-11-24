package Chapter3;

public class q25 {
}

interface Speak { default int talk() { return 7; } }
interface Sing { default int talk() { return 5; } }
class Performance implements Speak, Sing {
    public int talk() {
        return 0;
    }
    public static void main(String[] notes) {
        System.out.print(new Performance().talk());
    } }