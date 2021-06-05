package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CostumerObjects {
    public static void main(String[] args) {
        Costumer cs1  = new Costumer();
        System.out.println(cs1.toString());// print with default values
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1.toString());

        Costumer cs2 = new Costumer("Mike",2);// create object and asign values in same statement
        Costumer cs3 = new Costumer("Serghei Vlaicu",4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of costumers
        Costumer[] todaysCostumers = {cs1,cs2,cs3, new Costumer("Bashir", 449)};

        //arrayList of Costumer objects
        List<Costumer> costumersList = new ArrayList<>();
        costumersList.add(cs1);
        costumersList.add(cs2);
        costumersList.add(cs3);
        costumersList.add(new Costumer("Bashir", 449));
        costumersList.add(new Costumer("Sergiu", 446));

        //print info of first costumer object in array and arrayList
        System.out.println(todaysCostumers[0].toString());
        System.out.println(costumersList.get(0).toString());

        System.out.println(costumersList);

        for(int i = 0;i<costumersList.size();i++){
            System.out.println(costumersList.get(i));
        }
        for(Costumer costumer : costumersList){
            System.out.println(costumer);

            // print all names of costumers in list
            System.out.println("---- Names of Costumers ----");
            //lambada expression
            costumersList.forEach(each-> System.out.println(each.getName()));
            //or for each loop
            for(Costumer each : costumersList){
                System.out.println(each.getName());
            }
        }
    }
}
