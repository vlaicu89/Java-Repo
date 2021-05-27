package day42_array_colections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reversed letters = " + letters);

        System.out.println(Collections.frequency(letters, 'a')); // de cite ori se repeta caracterul ales
        
        int vCount = Collections.frequency(letters,'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println(letters.size());
        
        List<Integer> nums = Arrays.asList(23,1,2,33,5,5,5,5,55,43,-9);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        System.out.println("Max number is = " + Collections.max(nums)); // max number
        System.out.println("Min number is = " + Collections.min(nums)); // min number
        
        int countOf5 = Collections.frequency(nums,5);
        System.out.println("countOf5 = " + countOf5);

        Collections.replaceAll(nums, 5,50); // replacing 5 with 50.
        System.out.println(nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("nums = " + nums); // is sorting from the biggest to smallest number.

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);




    }
}
