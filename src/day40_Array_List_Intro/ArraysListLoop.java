package day40_Array_List_Intro;
import java.util.*;
public class ArraysListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());
        
        nums.add(34);
        nums.add(12);
        nums.add(11);
        nums.add(55);
        nums.add(100);
        nums.add(111);
        nums.add(12234);
        System.out.println("nums = " + nums);
        nums.remove(0);
        System.out.println("nums = " + nums);

        //nums.remove(55); ---->>> out of bound,cuz is thinking is at index 55
        nums.remove(new Integer(55));
        System.out.println("nums = " + nums);

        // for loop - iterate trough all values and print
        for(int i = 0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        //for each loop,and print all in the same line
        for(int each : nums){
            System.out.print(each + " ");
        }

    }
}
