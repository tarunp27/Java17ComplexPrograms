package UT4;

class Q17 {
    public static void main(String args[]) {
        int i = 1;
        int[] iArr = {1};
        incr(i);
        incr(iArr);
        incr(iArr[0]);
        System.out.println("i = " + i + "  iArr[0] = " + iArr[0]);
    }


    public static void incr(int n) {
        System.out.println("Int load");
        n++;
    }

    public static void incr(int[] n) {
        System.out.println("Int Array load");
        n[0]++;
    }
}

class Tarun {

}

class MyClass{

}
