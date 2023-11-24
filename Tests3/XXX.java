package Tests3;

public class XXX {
    public void m() throws Exception {
        throw new Exception();
    }
}

class YYY extends XXX {
    public void m() {
        System.out.println("YYY");
    }

    public static void main(String[] args) {
        Integer i = Integer.valueOf(1);
        XXX obj = new YYY();
        try {
            obj.m();
        } catch (Exception e) {
            System.out.println(e);
        }

        switch (Integer.parseInt(args[1])) {
            case 0:
                int x = 2;
                var b = false;
                break;
            case 1:
                //int x = 3;
               // System.out.println(x);
                break;
        }

    }
}
