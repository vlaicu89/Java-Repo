package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(11,12));
        double result = add(1,3);
        System.out.println("result = " + result);
        System.out.println(divide(1,7));

    }
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public static double divide(double num3, double num4) {
        double sum2 = num3 / num4;
        return sum2;

    }
}
