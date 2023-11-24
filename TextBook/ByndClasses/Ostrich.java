package TextBook.ByndClasses;

public class Ostrich {
    private static int count;
    static class OstrichWrangler
    { public int stampede() {
        return count;
    } }
}
interface Omnivore{
 default int findMore(){return 10;}
}