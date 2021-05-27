package day43_list_costum_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
      //  System.out.println(System.nanoTime());
        List<Integer> mlnNums = getIntegerList();
       int[] arr= getIntegerArray();
        System.out.println("mlnNums = " + mlnNums);
    }

    public static List<Integer> getIntegerList() {


        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);

        }
        return nums;


    }
    // 2nd method

    public static int[] getIntegerArray() {
        // declare empty array with size - 100001
        int[] nums = new int[1000000];
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;

        }
        return nums;
    }
}