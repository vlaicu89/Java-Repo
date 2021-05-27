package day28_loops;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        // Giving a string, find unique characters.
        String word = "javva";
        String unique = "";

        for(int i = 0; i<word.length();i++){

            if(!word.contains(word.charAt(i) + "")){ //checking if contains a uniq character then going down
                unique += word.charAt(i); // here is adding if is not present
            }

        }
        System.out.println(unique);
    }
}
