package Chapter3;

public sealed class Seasons {
    final static class Spring extends Seasons {}
    non-sealed class Summer extends Seasons {}
    public static void main(String[] w) {
        var t = new Spring();
//        final String m = switch (t) {
//            case Spring -> "Flowers";
//            case Summer -> "Pool";
       //     default -> "Snow";
        };
        //System.out.print(m);
    }
