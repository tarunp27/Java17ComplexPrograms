package UT3;


import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book> {
    String isbn;
    String title;
    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }


    //accessors not shown

    //assume appropriate implementations of equals and hashCode based on isbn property
//    public static void main(String[] args) {
//        List<Book> books = getBooksByAuthor("Ludlum");
//        books.stream().sorted().forEach(b->System.out.println(b.getIsbn())); //1
    }
//}




