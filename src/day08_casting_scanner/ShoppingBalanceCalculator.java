package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88, price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance - (price1 + price2 +price3);
        System.out.println(remainingBalance);
        int balanceWithoutChange = (int)remainingBalance; // asta facem ca sa se primeasca fara zecimale.
        System.out.println(balanceWithoutChange);
    }
}
