package day40_Array_List_Intro;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare a raw arraylist
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        // add values
        list1.add("java");
        list1.add("coffee");
        list1.add(1234);
        list1.add(32.2);
        list1.add(true);
        System.out.println("list1 = " + list1);
        System.out.println(list1.size());


    }
}
