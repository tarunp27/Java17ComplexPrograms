package Chapter3;

public class Dragon {
    static int gold;

    static {
        gold = 100;
    }

    boolean scaly;

    static void fly(boolean scaly) {
        scaly = true;
    }

     void saveTheDay(boolean scaly) {
        this.gold = 0;
    }

    Dragon protectTreasure(int value, boolean scaly) {
        scaly = true;
        return this;
    }

    int saveTheTreasure(boolean scaly) {
        return this.gold;
    }
}
