package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {

        ///////// PRINT NUMBERS WITHOUT LOOPS///////////
        int[] nums = {100,5,1,7,0,-4,44,33};
        System.out.println(Arrays.toString(nums));

        ///////////SORT NUMBERS ////////////////////////
         /////////// SORT CHANGES ARRAYS VALUE /////////
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words)); // we use string here just to print the numbers
        System.out.println("[" + String.join(", ", words)+ "]"); // here we use join to put coma between the words

          ///////////////SORT THE WORDS ////////////
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //////// SORT IN REVERSE ////////////

        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
