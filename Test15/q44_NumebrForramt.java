package Test15;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class q44_NumebrForramt {

}

 class TeastClass
{
    public static void main(String[] args) throws Exception
    {
        double amount = 53000.35;

        Locale jp = new Locale("jp", "JP");
        //NumberFormat formatter =NumberFormat.getCurrencyFormatter(jp);
        NumberFormat formatter =DecimalFormat.getCurrencyInstance();
        NumberFormat formatter1 =DecimalFormat.getCurrencyInstance(jp);
        System.out.println(   formatter.format(amount)  );
        System.out.println(formatter1.format(amount));
    }
}


