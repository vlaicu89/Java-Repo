package day31_arrays;
import java.util.*;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] nums = {33, 55, 123, 400};
        System.out.println(Arrays.binarySearch(nums,33));// -->>>> will be 0, because 33  is at index 0
        System.out.println(Arrays.binarySearch(nums,400)); // --->>> 400 is at index 3
        System.out.println(Arrays.binarySearch(nums,25));

    }
}
