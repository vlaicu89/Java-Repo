package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java , python , selenium, html";
        String[] wordsArray = words.split(","); // making array from simple String
        System.out.println(Arrays.toString(wordsArray)); // declaring all arrays
        System.out.println(wordsArray.length); // length of the array

        for(String words2 : wordsArray){
            System.out.println(words2);

        }
        String sentence = "Today i am coding with arrays";
        String [] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("first word: " + sentenceArray[0]); // print first word
        System.out.println("Numbers of words in sentence: " + sentenceArray.length);

        for(String each : sentenceArray){
            System.out.println(each); // print each word separate new line.
        }
    }
}
