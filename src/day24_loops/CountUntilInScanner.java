package day24_loops;
import java.util.Scanner;

public class CountUntilInScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int numberToStop = scan.nextInt();
        int start = 1;

        while(start<=numberToStop){
            System.out.print(start + " ");
            start++;
        }
        System.out.println("End numbers");


    }
}
