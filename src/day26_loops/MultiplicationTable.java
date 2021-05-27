package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;

        if(number < 1 || number> 12){
            System.out.println("Error");
            return;
        }
    //    System.out.println(number+ "x" + 1 + "=" + (number*1));  ===>>> first methode.
        for(int i = 1; i <=12; i++){
            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}
