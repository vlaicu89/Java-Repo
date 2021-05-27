package day40_Array_List_Intro;


import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("is empty ? = " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("pants");
        shoppingList.add("shirt");
        shoppingList.add("camisa");

        int count = shoppingList.size();
        System.out.println("Items to buy: " + shoppingList.size());

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else{
            System.out.println("shoes is not in the list");
        }
        System.out.println("buying shoes .... 80$");
        
        shoppingList.remove("shoes");
        System.out.println(shoppingList);
        System.out.println("done shopping");
        shoppingList.clear();
        System.out.println(shoppingList);
    }


}