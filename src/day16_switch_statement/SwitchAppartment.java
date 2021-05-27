package day16_switch_statement;

public class SwitchAppartment {
    public static void main(String[] args) {
        System.out.println("####### WELCOME TO OUR APPARTMENTS #######");
        int numberOfbedrooms = 2;
        double price = 0.0;
        switch(numberOfbedrooms){
            case 0:
                System.out.println("Studio appartment selected.");
                price = 1250.0;
                break;
            case 1:
                System.out.println("1 bedroom appartment selected.");
                price = 1550.0;
                break;
            case 2:
                System.out.println("2 bedroom appartment selected.");
                price = 1990.0;
                break;
            default:
                System.out.println(numberOfbedrooms + " bedroom appartment unavailable");
                return; // ca sa nu printeze pretul 0.0 in caz de nu merge nici un caz.
        }
        System.out.println("Starting price: $" + price);


    }
}
