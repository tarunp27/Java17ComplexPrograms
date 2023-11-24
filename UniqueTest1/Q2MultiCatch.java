package UniqueTest1;

public class Q2MultiCatch {
    public static void main(String[] args) {
        try {
            m1();
        } catch (IndexOutOfBoundsException e) {
            try {
                System.out.println("1");
                throw new NullPointerException();
            } catch (NullPointerException n) {
                System.out.println("Null pointer exception captured");
            }
        } catch (NullPointerException e) {
            System.out.println("2");
            return;
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("END");
    }

    static void m1() {
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException("Big Bang ");
    }
}
