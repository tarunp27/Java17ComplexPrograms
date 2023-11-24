package PractiseTest1;

class BubbleException extends Exception {}
abstract class Fish {
    Fish getFish() throws BubbleException{
        throw new RuntimeException("fish!");
    } }
final class Clownfish extends Fish {
    public final Clownfish getFish() throws BubbleException
    {
        throw new RuntimeException("clown!");
    }
    public static void main(String[] bubbles) throws
            Exception {
        final var v = (Fish)new Clownfish();
        Clownfish f =(Clownfish) v;
        f.getFish();
        System.out.println("swim!");
    } }
 class Legos {
    public static void main(String[] args) {
        var ok = true;
        if (ok) {
            var sb = new StringBuilder();
            sb.append("red");
            sb.deleteCharAt(0);
            sb.delete(1, 2);
            System.out.print(sb);
        }
    } }