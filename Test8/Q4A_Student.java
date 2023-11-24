package Test8;

import java.util.ArrayList;
import java.util.List;

public class Q4A_Student {
    private ArrayList<Integer> scores;                    //1123000   =>  9923000
    private double average;

    public double getAverage() {
        return average;
    }

    private void computeAverage() {
        int temp = 0;
        for (int score : scores) {
            temp += score;
        }
        average = temp / scores.size();
    }

    public Q4A_Student(ArrayList<Integer> a) {
//        scores = a;                               // 1123000
        scores = new ArrayList<>(a);                // 9923000
        computeAverage();
    }

    public void Q4A_Student() {
        System.out.println("hELLO");
    }

    @Override
    public String toString() {
        return "Q4A_Student{" +
                "scores=" + scores +
                ", average=" + average +
                '}';
    }


    public static void main(String[] args) {
        ArrayList<Integer> scr = new ArrayList<Integer>();     //1123000
        scr.add(100);
        scr.add(120);
        Q4A_Student s = new Q4A_Student(scr);
        System.out.println(s);
        scr.add(200);                                         //1123000
        System.out.println(s);

        var hasParams = (args == null ? false : true);
        if (hasParams) {
            System.out.println("has params");
        }
        {
            System.out.println("no params");
        }

    }


}
