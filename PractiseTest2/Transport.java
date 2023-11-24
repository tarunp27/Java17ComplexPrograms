package PractiseTest2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

//q26
//instance of
public class Transport {
    static interface Vehicle{};
    static class Bus implements Vehicle{}

    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(null instanceof Bus);
        System.out.println(bus instanceof Vehicle);
        System.out.println(bus instanceof Bus);
//        System.out.println(bus instanceof ArrayList);
        System.out.println(bus instanceof Collection);
        System.out.println(bus instanceof List);
        System.out.println(bus instanceof Map);
        System.out.println(bus instanceof Serializable);
    }
}
