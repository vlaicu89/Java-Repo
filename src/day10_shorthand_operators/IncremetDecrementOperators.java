package day10_shorthand_operators;

public class IncremetDecrementOperators {
    public static void main(String[] args) {
        int num = 10;
        num = num - 1;
        System.out.println("num = " + num); // 1st metod
        
        int num1 = 12;
        num1 -=1;
        System.out.println("num1 = " + num1); // 2nd metod
        
        int num2 = 13;
        num2 --;
        System.out.println("num2 = " + num2); // 3rd metod.
    }
}
