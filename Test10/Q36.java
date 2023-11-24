package Test10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q36 {
    public static void main(String[] args) {
//        List<Course> s1 = Arrays.asList(
//                new Course("OCAJP", "Java"),
//                new Course("OCPJP", "Java"),
//                new Course("C#", "C#"),
//                new Course("OCEJPA", "Java"));
        List<Course> s1 = Arrays.asList(
                new Course("O", "1"),
                new Course("O", "3"),
                new Course("A", "2"),
                new Course("B", "1"));


        s1.stream().collect(Collectors.groupingBy(c -> c.getCategory())).forEach((m, n) -> System.out.println(m));
    }
}


class Course {
    private String id;
    private String category;

    public Course(String id, String category) {
        this.id = id;
        this.category = category;
    }

    public String toString() {
        return id + " " + category;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}