package day35_void_methods_param;

public class MethodWithParameters {
    public static void main(String[] args) {
        displayValue(5);
        int count = 78;
        displayValue(count);
        greatByName("Serghei");

    }

    public static void displayValue(int num) {
        System.out.println("the value is " + num );

    }

    public static void greatByName(String name) {
        System.out.println("Hello " + name + " , how are you today?");

    }
}
