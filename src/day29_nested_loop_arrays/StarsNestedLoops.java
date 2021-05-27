package day29_nested_loop_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {


           //////////////////////// Method 1 ///////////////////////
            for(int outer = 1; outer <= 5; outer++){
            for(int inner = 1; inner <= 10; inner++){

                System.out.print("* ");
            }
            System.out.println(); //---->>> makes it to go to new line.

              // ///////////////////// Method 2 /////////////////////

        }

        for(int outer  = 1; outer <= 10; outer++){
            for( int inner = 10; inner >= outer; inner --) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
