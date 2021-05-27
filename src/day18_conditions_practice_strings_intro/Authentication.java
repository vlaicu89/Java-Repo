package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 0652, pinCode = 1234;
        if(last4SSN == 0652 && pinCode == 1234){
            System.out.println("Successful anticipation");
        }else if(last4SSN == 3422 && pinCode == 1234){
            System.out.println("SSN not match");
        }else{
            System.out.println("Pin code not match");
        }
    }
}
