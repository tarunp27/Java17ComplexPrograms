package Test16;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Readable {
}

public class q19_Array_comp {
    public static void main(String[] args) {
        q19_Array_comp ss = new q19_Array_comp() {

        };


        var a = new int[]{1, 2, 3, 4, 5};
        var b = new int[]{1, 2, 4, 4, 5, 8};
        var c = new int[]{1, 9, 3, 4, 5, 6, 7, 8};
        var e = new long[]{1, 2, 3, 4, 5};
        var f = new long[]{1, 5, 3, 4, 5};

        int x = Arrays.compare(a, b);
        int y = Arrays.compare(b, c);

        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 45);
        var zone = ZoneId.of("US/Eastern");

        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);
        System.out.println(dateTime.getOffset());

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);
        System.out.println(dateTime.getOffset());

    }
}

class FlowTest {

    static int[] data = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        for (var i : data) {
            if (i < 2) {
                continue;
            }
            System.out.print(i);
            if (i == 3) {
                continue;
            }
        }
    }
}

class Conversion {
    public static void main(String[] args) {
        float i = 1234567890;
        double f = i;
        System.out.println(i - f);


        short s = Short.MAX_VALUE;
        char c = (char) s;
        System.out.println(c == Short.MAX_VALUE);


    }
}

class SubstringTest {
    public static void main(String args[]) {
        //  var i = 10; System.out.println( i<20 ? out1() : out2() );
        String String = """
                string isa
                string""";
        System.out.println(String.substring(4, 6));


        class A {
        }
        class B extends A {
        }
        class C extends B {
        }
        class D extends C {
        }

        D d = new D();
        System.out.println((d instanceof A));

        Stream<String> s = Stream.of("brown bear-",
                "grizzly-");
        //s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
    }
}

class TestClass {
    static int si = 10;
    int ii = 20;

    public static void main(String[] args) {
        new TestClass().inner();
    }

    public void inner() {
        var ai = 30; //automatic variable
        //ai = 31;//ai is not effectively final anymore.
        var fai = 40; //automatic final variable.
        //Yes, a final local variable may also use var declaration
        class Inner {
            public Inner() {
                System.out.println(si + "  " + ii + "   " + fai + " " + ai);
            }
        }
        new Inner();
    }
}

class SomeThrowable extends Throwable {
}

class MyThrowable extends SomeThrowable {
}

class TestCalass {
    public static void main(String args[]) throws Throwable {
        try {
            m1();
        } catch (SomeThrowable e) {
            throw e;
        } finally {
            System.out.println("Done");
        }
    }

    public static void m1() throws MyThrowable {
        throw new MyThrowable();
    }
}

class TestingClass {
    static String str;

    public static void main(String[] args) {
        System.out.println(str);
    }
}

class LoadTest {

    public static void main(String[] args) throws Exception {
        LoadTest t = new LoadTest();
        int i = t.getLoad(3);
        double d = t.getLoad();
        System.out.println(i + d);


        IntStream is1 = IntStream.of(2, 3, 5);  //1
        OptionalDouble x = is1.filter(p -> p % 2 == 0).average(); //2
        System.out.println(x); //3


    }

    public int getLoad(int hive) {
        return 1;
    }

    public double getLoad() {
        return 3.0;
    }

}

class TewstClass {
    public static void main(String[] args) {
        try {
            hello();
        } catch (MyException me) {
            me.printStackTrace();
        }
    }

    static void hello() throws MyException {
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }

    static void foo() throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {
//    public MyException(String msg){
//        super(msg);
}

abstract class Base {
    abstract int power();
}

class A extends Base {
    @Override
    int power() {
        return 0;
    }
}

class TestClkass {

    static void processBase(Base base) {
        A x = null;
        if (base instanceof A a) {
            System.out.println(a.power());
        }
        System.out.println("a is " + x);
    }

    public static void main(String args[]) {
        processBase(new A());
    }
}

//assume appropriate imports
class PortConnector {

    public PortConnector(int port) throws IOException {
        //assume that random() returns a random value
        //between 0.0 (inclusive) and 1.0 (exclusive)

        if (Math.random() > 0.5) {
            throw new IOException();
        }

        throw new RuntimeException();
    }
}


//sealed interface Cacheable permits Value, Result{
//    default void clear(){ System.out.println("clearing cache..."); }
//}

class TesgtClass {


    public static void main(String[] args) {



        IntStream is1 = IntStream.range(0, 5); //1
        OptionalDouble x = is1.average(); //2
        System.out.println(x); //3



        LocalDate d1 = LocalDate.parse("2022-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2022, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        try {
            PortConnector pc = new PortConnector(10);
        } catch (RuntimeException re) {
            re.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

sealed class Document implements Readable permits Book {
}

non-sealed class Book extends Document implements Readable {
}

final class Journal extends Book {
}


