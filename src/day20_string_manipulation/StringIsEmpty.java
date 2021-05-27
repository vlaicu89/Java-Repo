package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String car = "";
        System.out.println("car");
        System.out.println(car.isEmpty());
        System.out.println(car.length() == 0);

        if(car.isEmpty()){
            System.out.println("job title is missing");
        }else{
            System.out.println("Job title looks good");
        }
        if(car.length() == 0){
            System.out.println("car is empty");
        }else{
            System.out.println("car is not empty");
        }
        System.out.println(car.equals(""));

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); //false

        if(!veggie.isEmpty()){
            System.out.println("veggie");
        }else{
            System.out.println("is not empty");
        }

        String word2;
      //  System.out.println(word2.isEmpty()); // error here, word2 is not initialized.
    }
}