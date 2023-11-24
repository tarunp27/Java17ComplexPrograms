package CHapter2;

public class q6 {
}

enum Admission { ADULT, SENIOR, CHILD}
class Movie {
    public static void main(String[] args) {
        int plan =1;
        plan = plan++ + --plan;
        System.out.println(plan);
        var price = switch (Admission.CHILD) {
            case ADULT -> 12.50;
            case SENIOR, CHILD -> 10;
        };
        System.out.println(price);
    } }