package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        System.out.println("Are you hungry?");
        boolean isHungry = false;
        if (isHungry == true ){
            System.out.println("I am hungry");
            System.out.println("Then code java");

        }else {
            System.out.println("I am not hungry");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200;
        if (isAffordable){
            System.out.println("Is affordable.");
        }else{
            System.out.println("Is not affordable.");
        }

        boolean isRemoteJob = true;
        if (isRemoteJob != true){
            System.out.println("Sure, i'm interrested.");
        }else{
            System.out.println("No, i'm not interested.");
        }
    }
}
