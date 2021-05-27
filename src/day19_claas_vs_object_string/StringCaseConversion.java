package day19_claas_vs_object_string;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.toLowerCase(Locale.ROOT)); // convert all letters to lower case.
        System.out.println(word.toUpperCase(Locale.ROOT)); // convert all letters to upper case.
        
        String countryCode = "USA";
        if(countryCode.equals("")){
            System.out.println("countryCode = " + countryCode);
            
        }
    }
}
