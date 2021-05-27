package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10,45)); // importa clasa "add" din clasa trecuta.
        System.out.println("divide 33/11 = " + Calculator.divide(33,11));

        double d1 = 234.4;
        double d2 = 321.1;
        double result = Calculator.add(d1,d2);    // la fel se importa din clasa exterioara, clasa Calculator.
        System.out.println("result = " + result);
    }
}
