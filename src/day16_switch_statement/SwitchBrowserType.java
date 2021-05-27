package day16_switch_statement;

public class SwitchBrowserType {
    public static void main(String[] args) {
        String browserType = "chrome";
        switch(browserType){
            case "chrome":
                System.out.println("Select Chrome");
                break;
            case "firefox":
                System.out.println("Select Firefox");
                break;
            case "explorer":
                System.out.println("Select explorer");
                break;
            default:
                System.out.println("Error");
                break;
        }

        String size = "tall";
        double price = 0.0;
        int calories = 0;
        switch (size){
            case "tall":
            System.out.println("Cappucino please!" );
            price = 3.69;
            calories = 90;
                break;
            case "large":
                System.out.println("Grande cappucino please!");
                price = 4.69;
                calories = 200;
                break;
            case "venti":
                System.out.println("Small cappucino please!" );
                price = 5.56;
                calories = 429;
                break;
            default:
                System.out.println("Other size.");
                break;
        }
        System.out.println( "Total price : " + price);
        System.out.println("Total calories: " + calories);

    }
}
