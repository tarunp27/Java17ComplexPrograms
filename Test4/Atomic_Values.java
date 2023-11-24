package Test4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import static Test4.TestOuter.*;



public class Atomic_Values {
    public static void main(String[] args) {
        TestOuter.TestInner t1 = new TestInner();
        AtomicInteger ai = new AtomicInteger(5);
        int yx = ai.incrementAndGet();
        System.out.println(ai);

        char c = 'g';
        int i = 100;
        switch (c) {
            case 'a':
                i++;
            case 'b':
                ++i;
            case 'c' | 'd':
                i++;
                System.out.println(i);
        }
        System.out.println(1+2.0);
    }
}



