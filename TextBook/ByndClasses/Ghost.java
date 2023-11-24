package TextBook.ByndClasses;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
}
    protected class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }
    public static void main(String... haunt) {
        var g = new Ghost().new Spirit() {};
       new Ghost().boo();
       Ghost.boo();
       g.boo();
    }
}