package PractiseTest1;

public class Ghost {
    private final String name;
    public Ghost() {
        this(null);
        System.out.println("No arg constructor");
//        this.name = "Casper";
    }
    static boolean myv = true;
    public Ghost(String n) {
//        name = "Boo";
        if(true){
            this.name = "Boo";
        }
    }
    public static void main(String[] sound) {
        var d = new Ghost("Space");
        System.out.println(d.name);
        String [] lions = new String[0];
    } }

