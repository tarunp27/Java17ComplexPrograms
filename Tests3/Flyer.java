package Tests3;

import java.sql.SQLOutput;

interface Flyers {
    String getName();
}
class Bird implements Flyers{
    public String name ;
    public Bird(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Eagle extends Bird{
    public Eagle (String name){
        super(name);
    }
}
class Testcases {
    public static void main(String[] args) {
        Flyers f = new Eagle("Hawk");
        //f.name;
        System.out.println(f.getName());
        System.out.println(((Eagle)f).name);
        System.out.println(((Bird)f).name);

    }
}
