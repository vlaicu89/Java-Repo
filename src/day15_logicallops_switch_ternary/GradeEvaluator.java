package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if( grade == 'A' || grade == 'B' ||  grade == 'C'){
            System.out.println("pass with grade - " + grade);
        }else if(grade == 'D'){
            System.out.println("Qualify for retake. Grade - "+ grade);
        }else if(grade == 'E'){
            System.out.println("Invalid grade - " + grade);

        }
    }
}
