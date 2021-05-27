package day26_loops;

public class PrintCharacters {
    public static void main(String[] args) {


        String word = "cellphone";
        for (int i = 0; i < word.length(); i++){
            //System.out.println(i); // here we printing the position of the letters
            System.out.println(word.charAt(i)); //  here we print the letters from the word
        }
        word = "java";
        for(int i = 3; i>= 0; i--){ // to skip the empty position 4, we just put after the length -1
            System.out.println(word.charAt(i)); // we read the word from the end to start
        }
    }
}