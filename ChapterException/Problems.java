package ChapterException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class MissingMoneyException extends Exception {}
class MissingFoodException extends Exception{}
public class Problems {
    public void doIHaveAProblem()
            throws MissingMoneyException, MissingFoodException
    {
        System.out.println("No problems");
    }
    public static void main(String[] z) throws MissingFoodException, MissingMoneyException {

        var p1 = Paths.get("/pony/../weather.txt");
        System.out.println(p1.normalize());
        try {
            final Problems p = new Problems();
            p.doIHaveAProblem();
        } catch (Exception e) {
            throw e;
        } } }



