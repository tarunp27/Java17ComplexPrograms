package TextBook;

public class Switch1 {
    public static void main(String[] args) {

        var s = "Hello";
        System.out.println(s == "Hello");
        System.out.println("Hello".intern() == s);

        byte amphibian = 1;
        String name = "Frog";
        String color = switch(amphibian) {
            case 1 ->
                    { yield "Red"; }
            case 2 -> "case2";
//                    { if(name.equals("Frog")) yield "Green"; }
            case 3 -> {System.out.println("Hello");
                    yield "Hello";}
//                    { yield "Purple"; }
            default ->
                    "others";
//                    throw new RuntimeException();
        };
        System.out.print(color);
    }

    void printIntegersOrNumbersGreaterThan5(Number number) {
        int i =10;
        if (!(number instanceof Integer data))
            ;
        else
        System.out.print(data.intValue());
    }


}
