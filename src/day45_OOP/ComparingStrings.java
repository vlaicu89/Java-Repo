package day45_OOP;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; // string pool
        String word2 = "java"; //reuse from string pool,because is the same variable
        String word3 = new String("java"); // create in heap, outside of string pool, because is a new string
        String word4 = new String("java");

        System.out.println(word1 == word2); //true
        System.out.println(word2 == word3); // false, because is not using the same variable from String Pool
        System.out.println(word3 == word4); // false,because we creating a new object and the variable will be separated
                                            //and they will be placed in heap, outside of the String pool

        System.out.println(word1.equals(word2)); // true, here we comparing the words as usual
        System.out.println(word2.equals(word3)); // true, here we comparing the words as usual
        System.out.println(word3.equals(word4)); // true, here we comparing the words as usual


    }
}
