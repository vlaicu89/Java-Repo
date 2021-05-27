package day35_void_methods_param;

public class voidMethods {
    public static void main(String[] args) {
        printAtoZ();
        // print a to Z 10 times
        for (int i = 0; i < 10; i++) {
            printAtoZ();
            displayUSFlag();
        }

    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void displayUSFlag() {
        System.out.println("-------------FLAG OF USA------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}