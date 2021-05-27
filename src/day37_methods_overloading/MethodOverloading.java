package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(1,5);
        sum(1, 9, 43);
        sum(1111.1,111221.3);
        sum("java", "fun");
    }
    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double num1, double num2");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void sum(String str1, String str2){
        System.out.println("String str1, String str2");
        System.out.println("Result = " + (str1 +str2));
    }
}