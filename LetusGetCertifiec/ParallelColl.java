package LetusGetCertifiec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelColl {
    public static void main(String[] args) {
        ParallelColl pc = new ParallelColl();
//        int[] array = {6,9,8};
//        for(int i = 0; i<20;i++) {
//            System.out.println("B" + Arrays.binarySearch(array,9));
//        }
        pc.rangeCalculate();
    }

    void rangeCalculate(){
        List<Integer> data = new ArrayList<>();
        IntStream stream = IntStream.range(0, 100).parallel();
            stream.forEach(
                    s -> {
                        synchronized (this)
                        {
                        data.add(s);
                        }
                    }
            );
        System.out.println(data.size());

    }

}
