package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String weather = "cold";
        //String weather = scan.next(); -->> aici merge doar un cuvint,pentru asta punem urmatorul rind.
        String  weather = scan.nextLine(); // aici se permite sa pui mai multe cuvinte.
        System.out.println("weather = " + weather);
        System.out.println(weather + "  - is a nice day today!");

    }
}
