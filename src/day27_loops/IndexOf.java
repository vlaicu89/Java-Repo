package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 't';
        int index = -1;
        for(int i = 0; i< word.length();i++){
           // System.out.println(i + "-" + word.charAt(i)); ==>> tu print position and it letter
            if(word.charAt(i) == letter){
                index = i;
                System.out.println(letter + " is found index " + index);
                //break; --->>>> if you put break,it exits the for loop
                //return; --->>>> is more powerful, stops the whole method.
            }

        }
        if(index == -1){
            System.out.println("Not valid!");
        }else{
            System.out.println(letter + " is found at position " + index);
        }
    }
}
