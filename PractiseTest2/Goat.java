package PractiseTest2;

import java.util.List;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

//q4
//Long stream
public record Goat(String food) {
    public static void main(String[] args) {
        var goats = List.of(
                new Goat("can"),
                new Goat("hay"),
                new Goat("shorts"),
                new Goat("hay"));


        goats.stream()
                .collect(groupingBy(Goat::food))
                .entrySet()                         //.forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
                .stream()
                .filter(e -> e.getValue().size() == 2)
                .map(e -> e.getKey())
                .collect(partitioningBy(e -> e.isEmpty()))
//                .forEach((k,v)-> System.out.println(k+":"+v));
                .get(false)
                .stream()
                .sorted()
                .forEach(System.out::print);


    }

}
