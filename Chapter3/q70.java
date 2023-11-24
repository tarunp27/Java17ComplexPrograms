package Chapter3;

public class q70 {
}
class Cinema {
    private String name = "Sequel";
    public Cinema(){}
    public Cinema(String name) {
        this.name = name;
    } }

class Movie extends Cinema {
    private String name = "adaptation";
    public Movie(String movie) {
        this.name = "Remake";
    }
    public static void main(String[] showing) {
        System.out.print(new Movie("Trilogy").name);
    } }
