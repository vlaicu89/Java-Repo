package day23_while_loop;

import java.util.Locale;

public class ChainingStringMethod {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ", "").toUpperCase(Locale.ROOT));

        String city = "CHICAGO";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).
                toLowerCase());
        // changig firts letter to upper case an then from upper to lower.



    }
}
