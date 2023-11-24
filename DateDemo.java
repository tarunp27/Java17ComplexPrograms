import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String input = args.length == 0 ? "2023-02-09" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        try{
            System.out.println(new Date() +"\n");
            Thread.sleep(3000);
            System.out.println(new Date()+"\n");
        }catch (Exception e){
            System.out.println("Got Exception");
        }
    }
}