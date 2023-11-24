package Test7;

class   Outer {
    int i = 10;
    static int j = 199;
    private int instanceLength = 5;
    private static int staticLength = 5;

    public class Inner {              // instance inner class
        static int i = 20;
        int j = 30;

        public void m1() {
            System.out.println(i);               // this also refer to inner i
            System.out.println(j);               // this also refer to inner i
            System.out.println(this.i);          // this refer to Inner i
            System.out.println(this.j);          // this refer to Inner i
            System.out.println(Outer.this.i);    // refering to Outerclass i
            System.out.println(Outer.this.j);    // refering to Outerclass i
        }
        public static void m2() {
            System.out.println(i);               // this also refer to inner i
//            System.out.println(j);               // this also refer to inner i
//            System.out.println(this.i);          // this refer to Inner i
//            System.out.println(this.j);          // this refer to Inner i
//            System.out.println(Outer.this.i);    // refering to Outerclass i
        }
    }

    public static class SInner {      // static inner class
        static int i = 40;
        int j = 50;

        public void m1() {
            int i =99;
            System.out.println(i);
            System.out.println(j);
            System.out.println(this.i);
            System.out.println(this.j);
//            System.out.println(Outer.this.i);
//            System.out.println(Outer.this.j);
        }
        public static void m2() {
            System.out.println(i);               // this also refer to inner i
//            System.out.println(j);               // this also refer to inner i
//            System.out.println(this.i);          // this refer to Inner i
//            System.out.println(this.j);          // this refer to Inner i
//            System.out.println(Outer.this.i);    // refering to Outerclass i
        }
    }

    public void iMethod() {
        System.out.println(this.i+" "+this.j);
        System.out.println(i+" "+j);
        int methodAge = 40;
        Inner i = new Inner();
        Outer.Inner oi = new Outer().new Inner();
        var iii = new Outer.Inner();                // instantiated like static class.  This is allowed. $$$$$$$$$
        Outer.SInner sio = new Outer.SInner();
        class LClass {                    // local class  (there is no local static class)
            public int iLocal =20;
            public static int jLocal =20;
            int somevalue = instanceLength * staticLength;
            public void m3(){
                int somevalue = instanceLength * staticLength;
                int age = 20;
                System.out.println(iLocal+ jLocal + age+ methodAge);
                age=45;
                iLocal = 55;
                jLocal = 55;
            }
            public static void m4() {
 //               int somevalue = instanceLength * staticLength;
                int age = 20;
//                System.out.println(iLoal+ jLocal + age+ methodAge);   // only jlocal is acessible all instace fields not allowed
                jLocal = 55;
            }
            LClass lc = new LClass();
        }
        //methodAge = 45;
        LClass lc = new LClass();
    }

    public static void sMethod() {
//        System.out.println(this.i+" "+this.j);
//        System.out.println(i+" "+j);        // int i is can not be referred but J can be used.

        //new Inner()

        class LLClass{
            //int somevalue = instanceLength * staticLength;
            void llImethod(){
            //    int somevalue = instanceLength * staticLength;
            }
            static void llSmethod(){
            //    int somevalue = instanceLength * staticLength;
            }
        };

        new LLClass().llImethod();
        new LLClass().llSmethod();



        new Outer().new Inner();
        new SInner();
        new Outer.SInner();
        //new Outer().Inner();
    }

    public static void main(String[] args) {
        class LClass {                    // local class  (there is no local static class)
        }
        LClass lc = new LClass();
    }
}


public class Q47NestedAll {
    public void printHello() {
        new Outer().new Inner();
        new Outer.SInner();
    }

    public static void main(String[] args) {
        new Outer().new Inner();
        var plan = 1;
        plan = plan++ + --plan;
        System.out.println(plan);
    }
}
