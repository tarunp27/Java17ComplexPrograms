package Test6;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}


public class Q47 {
    public static void main(String[] args) {
        Stream<Movie> sm = Stream.of(
                new Movie("a1", "a"),
                new Movie("a2", "a"),
                new Movie("a3", "a"),
                new Movie("b1", "b"),
                new Movie("b2", "b"),
                new Movie("c1", null));

        Map<Optional<String>, Long> gcount = sm.collect(
                Collectors.groupingBy(
                        movie -> Optional.ofNullable(movie.getGenre()), Collectors.counting()));

        System.out.println(gcount);

    }

}
