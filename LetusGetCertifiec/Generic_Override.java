package LetusGetCertifiec;

import java.awt.*;
import java.util.List;

public class Generic_Override {
    public List<? super Number> m1() {
        return null;
    }
}
class NewOverride extends Generic_Override{
    @Override
    public List<Number> m1(){
        return null;
    }
}
class Sample{
    public static void main(String[] args) {
        for(int i=0,j=0;i<j;j++){
            i+=2;
        }
    }
}
