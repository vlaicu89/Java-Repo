package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        while(letter <= 'z'){
            System.out.println(letter + " ");
            letter++;
        }
        letter = 'z';
        while(letter>= 'a'){
            System.out.println(letter + " ");
            letter--;
        }
    }
}
