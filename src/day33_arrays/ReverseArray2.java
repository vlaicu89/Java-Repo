package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] nums = {5,10,4,100};
        System.out.println("before swap: " + Arrays.toString(nums)); // printing the initial arrays
        int temp = nums[0];
        nums[3] = temp;
        System.out.println("after first and last swap: " + Arrays.toString(nums));

        int[] nums2 = {5,10,4,100};
        for(int i = 0; i< nums2.length/2;i++){
            int tem2 = nums2[i];
            nums2[i] = nums2[nums2.length-1 -i]=tem2;
        }
        System.out.println("After: " + Arrays.toString(nums2));



    }
}
