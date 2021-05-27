package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]); // print first word
        System.out.println("2nd word = " + words[1]);// print second word
       // System.out.println("4th word = " + words[4]); // out of bound, there is no 4th word

        /////////2ND METHOD /////////////////////
        for(String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] splitResult = googleResult.split(" ");
        System.out.println("Count = " + splitResult[1]); // printing the number from sentence
        System.out.println("Seconds = " + splitResult[3].substring(1)); // subtring 1 is eliminating the paranthese



    }
}