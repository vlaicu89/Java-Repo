package Office_Hours_Practice_03_01_2021;

public class PersonalInfo {
    public static void main(String[] args){
        // Variables
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignement of data

        name = "Serghei;";
        age = 50;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favoriteNumber = 365;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" + birthDate + "." + year; // daca punem " atunci o sa fie string .
        //fullBirthDate ="" + birthDate + year;//2025.2 adds first then
        favoriteQuote = "Have a good mindset";
        System.out.println(fullBirthDate);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    }
