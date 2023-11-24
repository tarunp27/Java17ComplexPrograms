package Test8;

public class Q49_Arrays {
    public static void main(String[] args) {
        int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}};
        System.out.println("Original: "+orig);
        int[][] dup = orig.clone();
        System.out.println("Duplicate: "+dup);
        int[] copy = dup[0].clone();
        System.out.println("Copy: "+copy);

        Integer i1 = 300;
        Integer i2 = 300;
        int ii1 = 300;
        int ii2 = 300;

        System.out.println( i1 == i2);
        System.out.println(ii1 == ii2);


        System.out.println(orig == dup);//because dup is a clone of orig and therefore, they will point to two different array objects.
        // Their elements, however, will point to the same objects.
        System.out.println(orig.equals(dup));//ecause equals method of all array classes simply check whether the two references point to the same object or not.
        // In other words, equals method of array classes returns the same result as ==.
        System.out.println(orig[0] == dup[0]);   // checking individual primitive values so true.
        System.out.println(dup[0] == copy);  // reference checking false
        System.out.println(dup[0].equals(copy));   // reference checking false
    }
}
