package CodeWars;

public class ReverseString {
    public static String reverseString(){
        StringBuilder sb = new StringBuilder("Hello reverse");
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString());
    }
}

//another method

class ReverseString2{
    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                // Reverse the word and append it to the result
                result.append(word.reverse());
                result.append(' ');

                // Reset the word buffer
                word = new StringBuilder();
            } else {
                // Append the current character to the word buffer
                word.append(c);
            }
        }

        // Append the last word to the result
        result.append(word.reverse());

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reverseWords(str);
        System.out.println(reversed);
    }
}