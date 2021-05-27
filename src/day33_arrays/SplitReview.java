package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajavajav";
        String[] array = word.split("a");
        System.out.println(array.length); // aflam lungimea la array
        int countOfA = array.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        ///////////////WHEN WE SPLIT BY NUMBER//////////////////////////

        String word6 = "java1sql2html";
        String [] split1 = word6.split("\\d"); // \\d is when we spliting by number
        System.out.println(Arrays.toString(split1));

        ////////////////////CHECKING IF THE PASSWORD IS MATCHING/////////////////////////

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
