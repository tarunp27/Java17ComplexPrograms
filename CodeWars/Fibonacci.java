package CodeWars;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;

        System.out.println("Enter the numbers of terms in the series!");
        Scanner scanner = new Scanner(System.in);
        int number = parseInt(scanner.nextLine());
        System.out.println("The number of elements in the series: " + number);


        for(int i=1;i<=number;i++){

            System.out.println(n1);
            int next=n1+n2;
            n1=n2;
            n2=next;
        }
    }
}
