package Test9;

interface Measurement {

    private void log(String msg) {
        System.out.println(msg);
    }

    public default int getLength() {
        log("getting length");
        return 10;
    }

    public default int getBreadth() {
        log("getting length");
        return 20;
    }
}

public class Q8 {
    public static void main(String[] args) {

    }
}
