package day35_void_methods_param;

public class Email {
    public static void main(String[] args) {
      buildEmail("vlaicu1989", "yahoo");
    }

    public static void buildEmail(String word1, String word2) {
        String email = word1 + "@" + word2 + ".com";
        System.out.println(email);

    }
}
