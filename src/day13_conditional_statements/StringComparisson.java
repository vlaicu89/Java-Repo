package day13_conditional_statements;

public class StringComparisson {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("It's not LA");

        }
        String num1 = "LA";
        //if(city2 == "Los Angeles"){ // not working this way
        if (num1.equals("LA")) {
            System.out.println("It is LA");
        } else {
            System.out.println("Is not LA");
        }
    }
}


