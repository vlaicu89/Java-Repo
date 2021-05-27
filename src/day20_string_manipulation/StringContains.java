package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {

        String firstName = "Nadir";
        System.out.println(firstName.contains("a")); // true

        if(firstName.contains("a") || firstName.contains("r")){
            System.out.println("a or r is present");

        }else{
            System.out.println("nor a or r is present");
        }

        String email = "VLAIcu1989@yahoo.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email");
        }else{
            System.out.println("Not valid.");
        }
        if(email.toLowerCase().contains("v")){
            System.out.println("v is present" );
        }else {
            System.out.println("v is not present");
        }
    }


}
