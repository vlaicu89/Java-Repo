package day12_conditional_statements;

public class IFElseStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Condition is true");
        }else {
            System.out.println("Condition is False");
        }

        int count = 25;
        // Check if cont is < 30.If yes, print "count is more than 30".
        // otherwise, print "count is less than 30".
        if (count > 30) {
            System.out.println("count is more than 30");
        }else {
            System.out.println("count is less than 30");
        }

        int age = 25;
        if (age >= 18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }

    }
}
