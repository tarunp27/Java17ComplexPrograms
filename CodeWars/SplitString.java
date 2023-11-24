package CodeWars;

public class SplitString {
    public static void main(String[] args) {
        String s ="abcdefg";
        SplitString str =new SplitString();
        System.out.println(str.solution(s));

    }
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
            if(i+1<s.length()){
                sb.append(s.charAt(i + 1));
            } else {
                sb.append('_');
            }
            sb.append(' ');
            }
        return sb.toString().trim();
    }
}
