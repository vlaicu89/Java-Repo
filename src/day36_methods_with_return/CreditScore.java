package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(712);
        checkEligible(457);
        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println(score);


    }

    public static int getCreditScore() {
        return 800;

    }


    public static void checkEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("Eligible for leasing this car");
        }else{
            System.out.println("Not eligible for leasing this car");
        }
    }
}
