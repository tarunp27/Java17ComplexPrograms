package Test8;

import java.util.ArrayList;
import java.util.List;

public class Q4_Student {
    private ArrayList<Integer> scores;
    private double average;

    public ArrayList<Integer> getScores() {
//        return scores;
        return new ArrayList<>(scores);
    }

    public double getAverage() {
        return average;
    }

    private void computeAverage() {
        int temp = 0;
        for(int score: scores){
            temp += score;
        }
        average = temp / scores.size();
    }

    public Q4_Student() {
        scores = new ArrayList<Integer>();
        scores.add(75);
        scores.add(55);
        computeAverage();
    }

    public static void main(String[] args) {
        Q4_Student s = new Q4_Student();
        System.out.println(s);
        List<Integer> myList = new ArrayList<>();
        myList = s.getScores();
        myList.add(100);
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Q4_Student{" +
                "scores=" + scores +
                ", average=" + average +
                '}';
    }
}
