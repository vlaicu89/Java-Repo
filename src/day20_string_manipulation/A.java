package day20_string_manipulation;

public class A {
    public static void main(String[] args) {
        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() -1);
        System.out.println(firstLetter + "" + lastLetter);
        System.out.println(lastLetter);
    }
}
