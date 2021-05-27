package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] charArray = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ' ,'f', 'u', 'n'};
        //print each letter using a loop
        for(char letters : charArray){
            System.out.print( letters + " ");
        }
       ///////////// CONVERTING CHAR TO STRING
        String sentence = new String(charArray);
        System.out.println(sentence);
        /////////////// CONVERTING STRING TO CHAR//////////////

        String item = "wood";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray.length);
        System.out.println(item.length());

        String[] languages = {"java","pyton", "casa", "mama"};
        System.out.println(String.join("",languages));
        System.out.println(String.join("##",languages)); // cu /join punem ce vrem intre cuvinte.
    }
}
