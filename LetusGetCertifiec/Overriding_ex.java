package LetusGetCertifiec;

import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Overriding_ex {

        public static void main(String[] args) {
        }

        public List<? extends CharSequence> check() {return null;}
}
class newOver extends Overriding_ex{
   // public List<? extends Object> check(){return null;}
}



