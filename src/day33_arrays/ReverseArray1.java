package day33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 4, 100};
        int[] numsReverse = new int[nums.length]; // all numbers will be 0

        for(int i = nums.length-1; i >= 0; i--){
            System.out.println(nums[i] + " ");
        }

    }
}
