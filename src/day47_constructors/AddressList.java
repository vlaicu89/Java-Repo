package day47_constructors;

public class AddressList {
    public static void main(String[] args) {


        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3330");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek school address : " + cybertekAddress.toString());
        cybertekAddress.setStreet("1104 PlumGrove ave");
        System.out.println("address after update : " + cybertekAddress.toString());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());

        Address papaJohnsPizza = new Address("2211 cermak street", "Dresden", "IL", "60169");
        System.out.println(papaJohnsPizza);

    }
}