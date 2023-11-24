package LetusGetCertifiec;

record Student(int id, String... subjects) {
    public Student {
        if (id < 0) {
            System.out.println("Id less than 0");
            throw new IllegalArgumentException();
        }
        if (subjects == null || subjects.length == 0) {
            subjects = new String[]{"english"};
        }
    }
}

public class Q45 {
    public static void main(String[] args) {
        Student s = new Student(123, null);
        System.out.println(s);
    }
}
