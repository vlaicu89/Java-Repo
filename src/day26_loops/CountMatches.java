package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;
        for(int i = 0; i< word.length(); i++){ // we find here how many "a" are in word "java".
            if(word.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("There are " + count + " " + letter + "'s in " + word);
    }
}
