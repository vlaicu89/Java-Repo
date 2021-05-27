package day40_Array_List_Intro;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(55);
        nums.add(11);
        System.out.println("nums = " + nums);
        System.out.println("size = " + nums.size());

        //reading from array list
        System.out.println("index 0 = " + nums.get(0));

        //print all values in same line
        System.out.println(nums);

        //remove element at index 1
        nums.remove(1);
        System.out.println(nums);
        
        
    }
}
