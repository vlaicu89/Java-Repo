package day29_nested_loop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2]= 7;
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]);// --->>> o sa fie indexul de la 0,care e 5
        i++;
        System.out.println(nums[i]); // ---->>> o sa fie +1 la index si o sa fie index 1, care e 10.

        //how to find the size of the array
        System.out.println("number of elements = " +nums.length);
        
        //store length of array into len(length) variable.
        int len = nums.length;
        System.out.println("len = " + len);

        // change the values in the array.

        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);
    }
}
