package day28_loops;
import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {

        Random random = new Random();
        String password = "";

        String source = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        for(int i = 1; i<=8;i++) {
            //System.out.println(random.nextInt(source.length())); //21 is just a random number, you could put any number.
            int index = random.nextInt(71); //it will give me a random number between 0 and 70
            System.out.print(source.charAt(index));
            //source.substring(index, index +1); --->>> first method.
            password += source.charAt(index);


        }
        System.out.println("\nYour passwor is: " + password); // \n --->>> go to new line.

    }
}