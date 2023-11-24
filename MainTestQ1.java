public class MainTestQ1 {
    public void test(int l){
        System.out.println("Integer");
    }
    public void test(long l){
        System.out.println("Long");
    }
    public static void main(String[] args) {
        new MainTestQ1().test(024);
    }
}
class NewMain{
    public static void main(String[] args) {
        int a =2;
        int b=~a;
        int c =a^b;
        System.out.println(c);
    }
}
