package Test10;

//Inner class extending outer class
public class Q30 {
    private String data = "skin";

    private class Layer extends Q30 {
        String data = "thegoodpart";

        public String getData() {
            return data;
        }
    }

    public String getData() {
        return new Layer().getData();
    }

    public static void main(String[] args) {
        var o = new Q30();
        System.out.println(o.getData());
    }
}
