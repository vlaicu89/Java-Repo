package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        int word = 1;
        // Break statement.
        for(int i = 1; i<=5; i++){
            System.out.println(i);
            if(i == 3){

                break; // at 3 will stop because the break.
            }

        }

         for(int i = 1;i<=5;i++) {
             System.out.println(i);
             if (i == 2 || i == 4) {
                 continue;
             }
             System.out.print(i); // continue will skip the numbers from condition.
         }

    }
}
