package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int str = Integer.parseInt(total);
        System.out.println("str = " + str); // converting String to int
        
        String str1 = "122.5";
        double price = Double.parseDouble(str1);
        System.out.println("str1 = " + price);    // converting String to double
        if(price > 100){
            System.out.println("is expensive");
        }
        String sentence = "I wrote 857 lines of code";
        //split by space, parse index 2 to int
        String[] arr = sentence.split(" ");
        int sen1 = Integer.parseInt(arr[2]);
        System.out.println("sen1 = " + sen1);
    }
}
