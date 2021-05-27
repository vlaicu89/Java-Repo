package day25_loops;

public class PrintEvenOrAddNumbers {
    public static void main(String[] args) {
        int num1 = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(i + " ");

            }
        }
        for(int n = 0; n<=100; n++){
            if(n % 2 != 0 ){
                System.out.println(n + " ");
            }
        }
    }
}
