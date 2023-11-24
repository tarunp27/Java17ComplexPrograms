package Test15;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.DoubleStream;

public class q10_Streams {
    public static void main(String[] args) {
        DoubleStream ds =  DoubleStream.of(1.0, 2.0, 3.0);
        //DoubleFunction<IntUnaryOperator> doubleF = m-> n->(int)m+n;
        //DoubleFunction<Double> doubleF = m->n->m+n;
        DoubleFunction<DoubleUnaryOperator> doubleF = m-> n->m+n;
        ds.map(doubleF.apply(5.0)).forEach(System.out::println);
    }
}
