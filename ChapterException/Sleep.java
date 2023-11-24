package ChapterException;

public class Sleep {
    public static void snore() throws Exception{
        try {
            String sheep[] = new String[3];
            System.out.print(sheep[3]);
        } catch (RuntimeException e) {
            System.out.print("Awake!");
            throw e; // x1
        } finally {
            throw new Exception(); // x2
        }
    }
    public static void main(String[] sheep) throws Exception {
        new Sleep().snore(); // x3
    } }