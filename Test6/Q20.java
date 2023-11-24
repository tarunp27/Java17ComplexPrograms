package Test6;

import java.util.ArrayList;
import java.util.List;

class Booby {
}

class Dooby extends Booby {
}

class Tooby extends Dooby {
}

public class Q20 {
    public static void main(String[] args) {
        var bL = new ArrayList<Booby>();
        var tL = new ArrayList<Tooby>();

        List<? extends Booby> bV = bL;

    }
}
