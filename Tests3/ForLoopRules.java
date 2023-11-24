package Tests3;

public class ForLoopRules {
    public static void main(String[] args) {
        int i = 0, j=10;
        for (i=0,j=5;i<j;i++) {;}
        if(true) {int x=5;}
        if(false) {int x=5;}
    }

    void someMethod(){
        int c = 0;
        JACK: while (c<0){
            JILL:
            System.out.println(c);
            HILL: if (c<3) break HILL; else c++;
        }
    }
}
