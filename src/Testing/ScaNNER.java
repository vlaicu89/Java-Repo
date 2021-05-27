package Testing;
import java.util.Scanner;

public class ScaNNER {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean tall = scan.nextBoolean();
        boolean fast = scan.nextBoolean();
        boolean flex = scan.nextBoolean();
        String sport = "";



        if(tall){
            if(fast){
                sport = "bask";
            }else if(flex){
                sport = "voley";

            }
        }else{
            if(fast){
                sport = "soccer";
            }else{
                sport = "tennis";
            }
        }
        System.out.println(sport);
    }
}
