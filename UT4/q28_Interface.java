package UT4;

public class q28_Interface {
}
interface Drink{
    default double getAlcoholPercent(){
        return 0.0;
    }

    static double computeAlcoholPercent(){
        return 0.0;
    }
}


interface ColdDrink extends Drink{
    String getName();
}

abstract class CrazyDrink implements ColdDrink{

}
