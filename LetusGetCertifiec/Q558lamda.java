package LetusGetCertifiec;

import java.util.function.Supplier;

class Employee {
    int age;
    int getAge(){
        return age;
    }
}

public class Q558lamda {
    public static void main(String[] args) {
        Employee e = new Employee();
        int addedAge =5;
        Supplier<Employee> se1 = () -> {e.age = 40+addedAge;return e;}; //1
        Supplier<Employee> se2 = () -> {e.age = 45;return e;}; //1
        e.age = 50;//2
        System.out.println(e.age);
        System.out.println(se1.get().age);
        System.out.println(se2.get().age);
        System.out.println(se1.get().getAge());
        System.out.println(e.age);
    }
}
