package day19_claas_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countryCode = "KG";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass");

        }else{
            System.out.println("Fail");
        }
    }
}