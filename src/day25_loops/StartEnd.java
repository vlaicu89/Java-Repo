package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter start and end");
        ///////////////////////// 1st example////////////////
        int start = scan.nextInt();
        int end = scan.nextInt();
        for(int i = start; i <=end; i++){     // scanner .
            System.out.print(i + " ");
        }
        ////////////////////////// 2nd example ///////////////

        start = 3;
        end = 6;
        for(int i = start; i <=end; i++){   // variable declaration example.
            System.out.print(i + " ");
        }
        // if is false, we doing it with if --> if(start>end){
       // System.out.println("reverse number is not supported");

    }
}
