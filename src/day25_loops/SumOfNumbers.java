package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int count = 0;
        //1-5
        for(int i=1; i<=5;i++){
            System.out.println(i);
            count +=i ; // sum = sum +i
        }
        System.out.println("count = " + count);



    }
}
