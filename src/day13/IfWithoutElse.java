package day13;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2025;
        if (year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask, and keep 6 feet distance");
        }
        System.out.println("Keep coding java");
        String country = "USA";
        if(country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Penn Ave");
        }
        System.out.println("Welcome to " + country);
    }
}
