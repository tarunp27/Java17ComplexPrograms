package Test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Books {
    private String title;
    private String genre;

    public Books(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return   '{'+
                genre + '\'' + ":"+
                title + '\'' +
                '}';
    }
}

class Question23 {
    public static void main(String[] args) {
        var books = new ArrayList<Books>(
                List.of(new Books("The Outsider", "fiction"),
                        new Books("Becoming", "non-fiction"),
                        new Books("Cujo", "fiction"),
                        new Books("Uri", "non-fiction")));

        books.sort(Comparator.comparing(Books::getGenre).thenComparing(Books::getTitle).reversed());
        System.out.println(books);





    }
}