package day29_nested_loop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int i = 0; i < word.length();i++){
           // System.out.println(word.charAt(i));
            for(int j = 0; j <= i; j++){
                System.out.println(word.charAt(j));
            }
            System.out.println();
        }
        //////////////// reverse it /////////////////
        for(int i = 0; i < word.length(); i++){
            for(int j = i; j < word.length(); j++){
                System.out.println(word.charAt(j));
            }
            System.out.println();
        }
    }
}
