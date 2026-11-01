package Strings;

public class palindrome {
    public static boolean Ispalindrome(String str){
        int n = str.length();

        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "aabbaa";
        System.out.println(Ispalindrome(str));
    }
}
