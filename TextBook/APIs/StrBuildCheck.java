package TextBook.APIs;

public class StrBuildCheck {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bbb").insert(3,"ccc");
        System.out.println(sb);
        System.out.println("---------------------------------------------");
        StringBuilder sb1 = new StringBuilder("12345");
        System.out.println(sb1.charAt(4));
        System.out.println(sb1.replace(2,4,"6").charAt(3));
        System.out.println(sb1.replace(2,5,"6").charAt(2));
        System.out.println(new String("12345").replace("123", "1").charAt(2));

        StringBuilder sb3 = new StringBuilder("Java");
        //sb3.reverse();
        sb3.append("vaJ$").delete(0, 3).deleteCharAt(sb3.length() -1);
        System.out.println(sb3);

        }
    }


