package Test4;

import java.util.ArrayList;
import java.util.List;

public class Q49Generic {
    public static void main(String[] args) {
        List<? super Float> a = new ArrayList<Float>();
        //List<? super Float> b = new ArrayList<Double>();
        List<? super Number> c = new ArrayList<Number>();
        //List<? super Number> d = new ArrayList<Integer>();
        List<? super Number> e = new ArrayList<Object>();

        List<? > f = new ArrayList<Object>();
        List<? > g = new ArrayList<Number>();
        List<? > h = new ArrayList<Integer>();


        List<? extends Number> i = new ArrayList<Number>();
        List<? extends Number> j = new ArrayList<Integer>();
        List<? extends Number> k = new ArrayList<Double>();
        //List<? extends Number> l = new ArrayList<Object>();


    }
}
