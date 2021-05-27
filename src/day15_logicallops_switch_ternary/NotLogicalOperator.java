package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if(!(age > 7)){
            System.out.println("Need to seat in car seat" + age);
        }else {
            System.out.println("no need " + age);

            boolean isSmokingAllowed = false;
            if(!isSmokingAllowed){
                System.out.println("is not allowed");
            }

            boolean isAffordable = true;
            if(!isAffordable){
                System.out.println("Item not affordable.");
            }

            String env = "qa";
            if(!env.equals("qa")){
                System.out.println("In wrong enviroment for QA testing");
            }
            String carModel = "Tesla";
            if(!carModel.equals("Tesla")){
                System.out.println("Not interested");
            }

            String secretPassword = "abc123";
            String inputPassword = "abc321";
            if(!inputPassword.equals("abc123")){
                System.out.println("Incorrect password");
            }
        }
    }
}
