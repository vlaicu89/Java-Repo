package day24_loops;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101)); // it will show random numbers from o to 100
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong, number is to large!");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, number is to small");
            }
            }while(guessingNumber != secretNumber);
                System.out.println("Congratulations,your secret number is " + secretNumber);




        }
    }

