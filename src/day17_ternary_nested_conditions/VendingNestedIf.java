package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "tea";
        String snack = "candy";
        if(selection.equals ("drink")){
            System.out.println("Drink is selected");
            if(drink.equals ("tea")){
                System.out.println("tea is selected");
            }else {
                System.out.println("Coke is selected");
            }
            } else if(snack.equals("candy")){

                    System.out.println("candy is selected");
                }else{
                    System.out.println("Chips is selected");
                    System.out.println("Nothing selected");
                }

            }
        }


