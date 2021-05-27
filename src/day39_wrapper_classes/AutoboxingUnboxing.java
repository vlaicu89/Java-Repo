package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // autoboxing  primitive -->> object.
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        // Un - boxing : object -->> primitive.

        Double d1 = new Double(233.4);
        double d2 = d1;  //--> primitive, unboxing
        double d3 = new Double(222.2); //--> primitive, Auto-unboxing

    }
}
