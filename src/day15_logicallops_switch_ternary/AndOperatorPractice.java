package day15_logicallops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemNume = "Wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("adding to cart - " + itemNume);

        } else {
            System.out.println("Continue shopping - " + itemNume);
        }
        if (freeShipping && onSale && itemNume.equals("wooden spoon")) {
            System.out.println("Adding to cart");
        } else {
            System.out.println("Free shipping");
        }
    }
}