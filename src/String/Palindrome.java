package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "nitin";

    }

    public static boolean pal(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}