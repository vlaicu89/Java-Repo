package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        double hourlyRate = 50.0;
        String response = (hourlyRate > 45) ? "Accept" : "Reject";
        System.out.println("response = " + response);
        
        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Murodil" : "Saim";
        System.out.println("teacher = " + teacher);
        
        boolean isEligible = true;
        String driving=(isEligible == true) ? "have dl" : "no dl, can't drive";
        System.out.println("driving = " + driving);
    }
}
