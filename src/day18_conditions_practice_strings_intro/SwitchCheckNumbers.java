package day18_conditions_practice_strings_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2 += 10;
                break;

            case 11:
                num1 += num2;
                num2--;
                break;

        }
            System.out.println("Result");
        }

}
