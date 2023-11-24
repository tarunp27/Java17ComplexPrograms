package Test9;

import Test6.Q35OOPS;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

class Employee {
    int age;   //1
}


public class Q9 {
    int __ =23223;
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(validateEmployee(e, c->e.age<10000));
        String s1 =null;
//        System.out.println(s1+"Pugal");
//        String s2 = s1+"pugal";
//        System.out.println(s2);
//
//        System.out.println(s1.concat("pugal"));
        String s111= """
                sds""";
        System.out.println(s111.length());

    }

    public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e);
    }

}



