package Tests3;

public class Quesion10 {
    int i;

    public Quesion10(int i) {
        this.i = i;
    }

    public String toString() {
        if (i == 0) return null;
        else return "" + i;
    }

    public static void main(String[] args) {
        Quesion10 t1 = new Quesion10(0);
        Quesion10 t2 = new Quesion10(2);
        System.out.println(t2);
        System.out.println("" + t1);
        System.out.println("");
        System.out.println("" + null);


    }
}


