package day38_methods;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
   // String word = "Vlaicu";
  //  String revWord = StringUtils.reverse(word);
}
