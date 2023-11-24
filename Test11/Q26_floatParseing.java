package Test11;

public class Q26_floatParseing {
    public static void main(String[] args) {
        Q26_floatParseing q = new Q26_floatParseing();
        System.out.println(q.parseFloat(""+Float.NEGATIVE_INFINITY));     //-Infinity
        System.out.println(q.parseFloat(""+Float.POSITIVE_INFINITY));     //Infinity
        System.out.println(q.parseFloat("junk"));                         //0.0
        //System.out.println(Float.parseFloat("junk"));                      //NumberFormatException
        System.out.println(q.parseFloat("Nan"));                           //0.0
        System.out.println(q.parseFloat("-Infinity"));                     //-infinty
    }
    public  static  float parseFloat(String s){
        try{
            return Float.parseFloat(s);
        }
        catch (NumberFormatException e){
            return 0.0f;
        }
        catch (IllegalArgumentException e){
            return Float.NaN;
        }
    }
}
