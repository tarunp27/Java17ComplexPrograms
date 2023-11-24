package UniqueTest1;

import java.util.ArrayList;
import java.util.List;

class Base {
    public List<? super Integer> transform(List<Object> list) {
        return null;
    }
}

public class Q29 extends Base {
    public List<? super Number> transform(List<Object> list) {
        return null;

    }
}
