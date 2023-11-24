package Test11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book{
    String Title;
    Double Price;

    public Book(String title, Double price) {

        Title = title;
        Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public Double getPrice() {
        return Price;
    }
}

//collection
public class Q10 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
//                new Book("Gone with the wind", 10.0),    // exception duplicate key not allowed in map
                new Book("Atlas Shrugged", 15.0));

        books.stream().collect(Collectors.toMap((b -> b.getTitle()),
                b -> b.getPrice())).forEach((a, b) -> System.out.println(a + " " + b));
    }
}
