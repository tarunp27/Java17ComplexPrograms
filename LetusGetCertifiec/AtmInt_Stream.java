package LetusGetCertifiec;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtmInt_Stream {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<String> st = Stream.of("lady","cat","corner","fast","ronny","octane","optimum");
        st.filter(e->{
           // ai.incrementAndGet();
            return e.contains("o");
        }).anyMatch(x->x.indexOf("o")>5);
        System.out.println(ai);
    }
}
