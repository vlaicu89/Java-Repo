package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 88;
        String result = (score > 60) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("x = " + x);

        score = 90;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);


        
    }
}
