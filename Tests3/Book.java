package Tests3;

interface Book {
    default String getId(){
        return "1SRN123";
    }
}
interface Encyclopedia extends Book{
     String getId();
}
class Information implements Book,Encyclopedia{
    public String getId(){
        return "Class";
    }
    public static void main(String[] args) {
        Information in = new Information();
        System.out.println(in.getId());
    }
}
