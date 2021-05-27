package day15_logicallops_switch_ternary;

public class JobOfferSellector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120000.0;
        boolean isRemote = true;
        boolean benefits = false;
        if(location == ("Honolulu") && salary >= 120000.0 && isRemote && benefits){
            System.out.println("Sure, i will accept this offer");

        } else {
            System.out.println("Reffusing");
        }
    }
}
