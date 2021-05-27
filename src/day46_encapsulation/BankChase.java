package day46_encapsulation;

public class BankChase {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountHolder("Serghei Vlaicu");
        checkingAccount.setAccountNumber(48574733892920L);
        checkingAccount.setBalance(24233.23);
        checkingAccount.setType("Checking");

        System.out.println(checkingAccount);
    }
}
