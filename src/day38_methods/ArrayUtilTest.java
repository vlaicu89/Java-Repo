package day38_methods;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] nums = {3,123,67,9};
        ArrayUtils.printArrays(nums);
        ArrayUtils.printArrays(new int[]{23,64,23,534,234,45,234,45});
        System.out.println("sum = " + ArrayUtils.sum(nums)); // is importing from Array.utils class
    }
}
