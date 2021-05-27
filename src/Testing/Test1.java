package Testing;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personaNumber;

        //Enter your code here
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zipcode");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal number");
        personaNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        fullName = scan.nextLine();


        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + street + city + zipcode);
        System.out.println("Contacts: work phone number -  " + workPhoneNumber + " personal phone number - " + personaNumber + " email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married?: " + isMarried);


        // continue for city




    }



}
