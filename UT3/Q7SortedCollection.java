package UT3;

import Test6.Q35OOPS;
import com.sun.source.tree.LambdaExpressionTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Q7SortedCollection {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print);

        System.out.println();
        Stream<String> s2 = Stream.of("brown-", "bear-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::print);

        System.out.println();
        Stream<String> s3 = Stream.of("brown-", "bear-", "arun-");
        s3.sorted((a, b) -> a.compareTo(b)).forEach(System.out::print);
        System.out.println();

        List<Book> books = List.of(
                new Book("1002A","Ludlum"),
                new Book("9934F","Shakesphere"),
                new Book("0234T","Forsyth"),
                new Book("8234F","Brown")
        );

        Comparator<Book> cm = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.isbn.compareTo(o2.isbn);
            }
        };
        books.stream().sorted().forEach(b->System.out.println(b.getIsbn()));

        books.stream().sorted(cm).forEach(b->System.out.println(b.getIsbn()));



        //        books.stream().sorted().forEach(b->System.out.println(b.getIsbn()));
    }
}

