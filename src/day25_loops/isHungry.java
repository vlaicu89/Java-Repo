package day25_loops;

public class isHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while(isHungry){
            bananas++;
            System.out.println("eating banana: " + bananas);
            if(bananas == countToFull){
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas");
    }
}
