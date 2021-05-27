package day35_void_methods_param;

public class MultipleParameters {
    public static void main(String[] args) {
     showSum(2333,3444);
    }

    public static void showSum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
}
