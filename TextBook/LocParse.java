package TextBook;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.text.ParseException;

public class LocParse {
    public static void main(String[] args) throws ParseException {
        String  income ="$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        double value =(Double) (cf.parse(income));
        System.out.println(value);
    }
}
