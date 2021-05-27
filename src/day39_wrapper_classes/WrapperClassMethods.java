package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5)); // is comparing and giving us the biggest number
        System.out.println(Integer.sum(22,1)); // sum
        System.out.println(Integer.min(2222,112));  // minimum number

        System.out.println("MIN INT: " + Integer.MIN_VALUE); // minimum value from int variables
        System.out.println("MAX INT: " + Integer.MAX_VALUE); // maximum from int

        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1)); // it gives you 1 when first number is larger
        System.out.println(Double.compare(4,4));// 0 when is equal
        System.out.println(Double.compare(1,5)); // -1 when first number is smaller than second

        System.out.println(Character.isDigit('8')); // true
        System.out.println(Character.isDigit('v')); // false
        System.out.println(Character.isAlphabetic('A')); // true
        System.out.println(Character.isLetter('r')); // true
        System.out.println(Character.isUpperCase('A')); // true

        char letter = 'A';
        if(Character.isUpperCase('A')){
            System.out.println("Right");
        }else{
            System.out.println("Lie");
        }

        String word = "JaVa iS FuN";
        for(int i = 0; i < word.length();i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));   // here we printing only upper case letters
            }
        }




    }
}
