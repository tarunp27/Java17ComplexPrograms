package UT2;

import java.util.ArrayList;
import java.util.List;

public class Q42 {
    public static void main(String[] args) {
    }

    public List<Shape> m3(ArrayList<? extends Shape> strList){
//       List<? extends CShape> list = new ArrayList<>();
//        List<? extends Shape> list = new ArrayList<>();
        List<Shape> list = new ArrayList<>();
        list.addAll(strList);
        list.add(new CShape());
        return list;
    }


}

class Shape{
}

class CShape extends Shape{}