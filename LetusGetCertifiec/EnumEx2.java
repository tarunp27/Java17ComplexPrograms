package LetusGetCertifiec;

import java.io.Serializable;
import java.util.Arrays;

interface I {
}

enum EnumA implements I, Serializable {A, AA, AAA};

public class EnumEx2 {
    public enum EnumB {B, BB, BBB;
        public int printNum(){return 4;};
//        public String toString() {return "enum name is EnumB";}
//        public Object clone() {return null;}
//        public int hashCode() {return 1;}
//        public void finalize(){}
//        public boolean equals(Object o) {}
        EnumB(){};
    }

    public static enum EnumC{ C, CC, CCC };

    public static void main(String[] args) {
        System.out.println(EnumC.valueOf("CCC"));
        System.out.println(EnumC.CCC.name());
        System.out.println(EnumC.CCC.toString());
        System.out.println(EnumC.values());   //RETURS ARRAY
        System.out.println(EnumC.CCC.ordinal());
        System.out.println(EnumC.CCC.getClass());
    }
}

