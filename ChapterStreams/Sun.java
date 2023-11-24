package ChapterStreams;

import java.util.IntSummaryStatistics;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Sun {
    public static void dawn(UnaryOperator<Integer> sunrise) {}
    public static void main(String[] rays) {
        dawn(s -> s+1);
        IntSummaryStatistics stats = Stream.of(20, 40)
                .mapToInt(i -> i)
                .summaryStatistics();
        long total = stats.getSum();
        long count = stats.getCount();
        long max = stats.getMax();
        System.out.println(total + "-" + count + "-" + max);
    } }