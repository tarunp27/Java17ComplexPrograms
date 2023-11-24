package Tests3;

public class Final_Variables {
    int age1;
    static int sAge ;
    final int F_age;
    static final int FS_age ; //cannot be done in constructor
    static {                    //static final variables can be initialized in static block
       FS_age=9;
    }

    Final_Variables() {
        sAge = 29;     //static non_final can be initialized in constructor
        age1=9;
        F_age=8;
       // FS_age=9;    //final static variable cannot be initialized here
    }
}
