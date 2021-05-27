package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit); // Varianta 1.
        System.out.println(speedLimit< currentSpeed); // Varianta 2.
        System.out.println(speedLimit == currentSpeed); // Varianta 3.
        
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        

    }


}
