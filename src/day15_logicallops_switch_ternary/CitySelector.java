package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "Tampa";


        if(city1 == ("Moscow") || city1 == ("Tampa")){
            System.out.println("Willing to relocate to " + city1);
        }else {
            System.out.println("Not considering Boston " + city1);
        }


        String teacher = "Nadir";
        if(teacher == ("Saim)") || teacher == ("Murodil")){
            System.out.println("It s java class with " + teacher);
        }else{
            System.out.println("Its java class with " + teacher);
        }

        String company = "NadirTech";
        double salary = 85000.0;
        if(company == ("Google") || salary >= 100000){
            System.out.println( "Accepting " + company);
        }else{
            System.out.println("not accepting " + company);
        }



    }
}
