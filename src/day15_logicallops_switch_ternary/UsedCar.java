package day15_logicallops_switch_ternary;

public class UsedCar {
    public static void main(String[] args) {



    double budget = 5000.0;
    String model = "Honda" ;
    double carPrice = 4999.9;

    if(carPrice <= budget && (model ==("Toyota")||model ==("Honda"))){

        System.out.println("Ready to purchase model = " + model + ", price " + carPrice);
    }else{
        System.out.println("Not interested in mode = " + model + ",price = " + carPrice);
    }
}
}

