package Test9;

enum Bike {
    Bullet, Pulsar, Dukati, Yamaha;
    Bike(){
        System.out.println("Constructor !");
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Bike b1 = Bike.Bullet;
        Bike b2 = Bike.Bullet;
        m2();
        Bike[] ba= Bike.values();
        for(Bike bf:ba){
            System.out.println(bf.name());
            System.out.println(bf.ordinal());
        }
    }

    public static void  m2(){
        Bike b3= Bike.Dukati;
    }
}
