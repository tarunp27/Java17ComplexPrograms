package Test13;

import java.io.IOException;

public class Q30_Exception {

}

class X extends Q30_Exception{
    byte getStatus(Object obj)throws NullPointerException{
        if(obj != null) return 127;
        else return -1;
    }
}
class Y extends X{
    byte getStatus(Object obj) {
        if(obj != null) return (byte)-128;
        else return 1;
    }
}