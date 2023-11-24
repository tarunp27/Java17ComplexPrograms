package UT2;

import java.time.*;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class q27_Exception {
        static String j = "";
        public static void method( int i){
            try{
                if(i == 2){
                    throw new Exception();
                }
                j += "1";
            }
            catch (Exception e){
                j += "2";
                return;
            }
            finally{
                j += "3";
            }
            j += "4";
        }
        public static void main(String args[]){
//            method(1);
//            method(2);
//            System.out.println(j);
//
            var odds = IntStream.iterate(1, a -> a+2);
            var evens = IntStream.iterate(2, a -> a+2);
            var sums = Stream.concat(odds.boxed(), evens.boxed()).limit(3).collect(Collectors.summarizingDouble(e->e));
            System.out.println(sums);

                }
            }




