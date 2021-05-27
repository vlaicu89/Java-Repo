package day38_methods;


public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
}
