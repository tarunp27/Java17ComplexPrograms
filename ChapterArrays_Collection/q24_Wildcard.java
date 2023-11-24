package ChapterArrays_Collection;

import java.io.IOException;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.TreeSet;

public class q24_Wildcard {
    public static void throwOne(Collection<? extends RuntimeException> coll)
    {
//        var iter = coll.iterator();
//        if (iter.hasNext())
//            throw iter.next();
    }
    public static void main(String[] args) {
        var halleysComet =
                Path.of("stars/./rocks/../m1.meteor")
        .subpath(1, 5).normalize();
        System.out.println(halleysComet);
        var ints = new int[] {2,7,1};
        var others = new int[] {2,7,1,8,7};
        System.out.println(Arrays.compare(ints, others));
        double p = 1_909.2;
        var nf1 =
                NumberFormat.getCompactNumberInstance();
        var nf2 = NumberFormat.getCompactNumberInstance(
                Locale.getDefault(), NumberFormat.Style.SHORT);
        var nf3 = NumberFormat.getCompactNumberInstance(
                Locale.getDefault(), NumberFormat.Style.LONG);
        System.out.println(nf1.format(p));
        System.out.println(nf2.format(p));
        System.out.println(nf3.format(p));
    }
    private void kite(){}
}
