package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("Wlcome to TD Bank ATM");
        int secretPincode = 1905;
        int inputCode = 1995;
        if(secretPincode == inputCode){
            System.out.println("Welcome to your bank " );
            System.out.println("You can wirthdau,chek balance");

        }else {
            System.out.println("Incorect pin code! 1234");
            System.out.println("Please try again.");
        }
    }

    public static class NiceDayOrNot {
        public static void main(String[] args) {
            System.out.println("Temperature is nice?");

            int  temp = 71;
            if(temp>=70){
                System.out.println("It's a beautiful day!");
                System.out.println("Let's code Java!");
            } else {
                System.out.println("It is kind of cold today.");
                System.out.println("Let's stay home and code Java");
            }
        }
    }
}
