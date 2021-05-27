package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 1500.0;

        if (salesAmount <= 2000) {
            System.out.println("Good job!");
            bonus = 50.0;

        } else {
            System.out.println("Great job, you have a bonus!");
            bonus = 100.0;
        }
        System.out.println("Good job, your full bonus is yours!" + bonus);
    }
}
