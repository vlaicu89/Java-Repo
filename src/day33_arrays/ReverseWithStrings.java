package day33_arrays;

import java.util.Arrays;

public class ReverseWithStrings {
    public static void main(String[] args) {
        String[] words = {"java", "html", "js", "ruby", "css"};
        for(int i = 0, j = words.length -1;i < words.length/2;i++,j--){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
            System.out.println(Arrays.toString(words));
        }
    }
}
