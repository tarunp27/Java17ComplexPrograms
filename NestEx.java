import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NestEx {
}
class TestClass{
    public class A
    {
    }
    public static class B
    {
    }
    public void useCases(){
        new A();
        new TestClass.B();
        new TestClass().new A();
        new TestClass.A();
    }

    public static void main(String[] args) {
        var sum = 90.8;
        System.out.println(Math.floor(sum));
        Date date = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd/MMMM/yy",Locale.GERMANY);
        System.out.println("Current date:" + d.format(date));

    }
}
