package PractiseTest1;

class InformationException extends Exception {}
public class LackOfInformationException
        extends InformationException {
    public LackOfInformationException() { // t1
        //super("");
    }
    public LackOfInformationException(String s) { // t2
        this(new Exception(s));
    }
    public LackOfInformationException(Exception c) { // t3
        super();
    }
    public String getMessage() throws ArithmeticException {
        return "lackOf";
    } }
