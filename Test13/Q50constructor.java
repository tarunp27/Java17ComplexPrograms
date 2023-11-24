package Test13;

class Data {
    int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x; this.y = y;
    }
}

public class Q50constructor {
    public static void main(String[] args) {
        Data d = new Data(1, 1);
        d = new Data(2, 2);
    }
}
