package Test9;

public class Q1 <T> {
    T s;
    public  void genericDisplay(T element)
    {
        this.s = element;
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        new Q1().genericDisplay(292);
        new Q1().genericDisplay("tarun");
        new Q1().genericDisplay(2.3);

//        String s1 = null;
//        s1.substring(0,1);

    }


}
