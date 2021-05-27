package day21_string_manipulation;

public class CharAtMethod {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String company = "Cybertek";
        System.out.println(company.charAt(0));
        char fisrt = company.charAt(0);
        System.out.println(fisrt);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);
        System.out.println(fisrt + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh + " " + eighth);
    
        String withSpaces = fisrt + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh + " " + eighth;
        System.out.println("withSpaces = " + withSpaces);

        String word5 = "mom";
        char first = word5.charAt(0);
        char last = word5.charAt(2);
////////////////1////////////////////////////////////////////////
        if(first == last){
            System.out.println("match");
        }else{
            System.out.println("not match");
////////////////////////// 2  ///////////////////////////////////
            if(word.charAt(0) == word.charAt(2)){
                System.out.println("match");
            }else{
                System.out.println("not match");
            }
////////////////////////////////3////////////////////////////////
             String friend = "aziza";
            char firstLetter = friend.charAt(0);
            char lastLetter = friend.charAt(friend.length() -1);
            System.out.println(firstLetter);
            System.out.println(lastLetter);
        }

////////////////////////// 4 ////////////////////////////////////////


    } 
    
        
}
