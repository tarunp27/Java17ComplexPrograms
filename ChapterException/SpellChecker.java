package ChapterException;

class SpellingException extends RuntimeException {
}

public class SpellChecker {
    public static void main(String[] args) {
        try {
            if (!"cat".equals("kat")) {
                new SpellingException();
            }
        } catch (SpellingException | NullPointerException e) {
            System.out.println("Spelling problem!");
        } catch (Exception e) {
            System.out.println("Unknown Problem!");
        } finally {
            System.out.println("Done!");
        }
    }
}
