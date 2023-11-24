package UT4;

public class q11Java00A {
        static String s1 = sM1("a");{
            s1 = sM1("b");
        }
        static{
            s1 = sM1("c");
        }
        public static void main(String args[]){
            q11Java00A it = new q11Java00A();
        }
        private static String sM1(String s){
            System.out.println(s);  return s;
        }
    }

