package day32_arrays_split;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MallShopping {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("Find the index of 'Gloves' in items arrays");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) ;
            {
                System.out.println("Gloves found at index  " + i);
                break;

            }
        }

        System.out.println("Set boolean to true if ipad is found");
        boolean ipadExists = false;
        for (String item : items) {

            if (item.equalsIgnoreCase("Ipad")) {
                ipadExists = true;
                break;

            }

        }

        System.out.println("ipadExists = " + ipadExists);
///////////DECLARE EVERY ITEM AND ITS PRICE AND ITEM NR//////////////
        /////////PRINT A REPORT ////////
        System.out.println("print a report of each shopping item");
        for(int i = 0; i< items.length;i++){
            System.out.println(items[i] + " -$"+ prices[i] + " item nr " + itemIDs[i]);
        }
      /////////// FIND ONE ITEM WITH ITS PRICE AND CODE////////////////
        for(int i = 0; i< items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] +" -$" + prices[i] + " "+ "#" + itemIDs[i]);
                break;
            }
        }
    }
}