package day42_array_colections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFormList {
    public static void main(String[] args) {
        List<Integer> uniqueList = getUniqueList();
        System.out.println("\nunique list = " + uniqueList);
    }
  // here we extracted the method ( select everything after main method,
  // right click and then refactor, and then extract method
    @NotNull
    private static List<Integer> getUniqueList() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        //new array list to store unique numbers.
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : nums){
          //  System.out.print(num + " "); -->> first example. here we printing all numbers.
            if(Collections.frequency(nums, num) == 1){
                System.out.print(num + " "); // here we printing numbers only one time,
                // which is repeating is orinting just one time.
                uniqueList.add(num);

            }

        }
        return uniqueList;
    }
}
