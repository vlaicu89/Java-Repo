package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
   static  List<String> carModels;
    static int num;


    static{
        System.out.println("static initializer block");
        num = 10;
        carModels= new ArrayList<>();
        carModels.addAll(Arrays.asList("Alfa Romeo",
                "Aston Martin",
                "Audi",
                "Bentley",
                "BMW",
                "Bugatti",
                "Cadillac",
                "Chevrolet",
                "Chrysler",
                "Citroën",
                "Daewoo",
                "Dacia",
                "Daihatsu",
                "Dodge",
                "Donkervoort",
                "DS",
                "Ferrari",
                "Fiat",
                "Fisker",
                "Ford",
                "Honda",
                "Hummer",
                "Hyundai",
                "Infiniti",
                "Iveco",
                "Jaguar",
                "Jeep",
                "Kia",
                "KTM",
                "Lada",
                "Lamborghini",
                "Lancia",
                "Land Rover",
                "Landwind",
                "Lexus",
                "Lotus",
                "Maserati",
                "Maybach",
                "Mazda",
                "McLaren",
                "Mercedes-Benz",
                "MG",
                "Mini",
                "Mitsubishi",
                "Morgan",
                "Nissan",
                "Opel",
                "Peugeot",
                "Porsche",
                "Renault",
                "Rolls-Royce",
                "Rover",
                "Saab",
                "Seat",
                "Skoda",
                "Smart",
                "SsangYong",
                "Subaru",
                "Suzuki",
                "Tesla",
                "Toyota",
                "Volkswagen",
                "Volvo"));
    }
    {
        System.out.println("initializer block"); // is running first, before the constructor
    }
    public StaticBlockDemo(){
        System.out.println("constructor runs");
        num += 5;
    }
    public StaticBlockDemo(int value){
        num += value;
    }
}
