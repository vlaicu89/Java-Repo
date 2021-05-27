package day10_shorthand_operators;

public class ShortHandoperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("carsin parking lot = " + cars);
        
        cars = cars + 15;
        System.out.println("cars in parking lot = " + cars);

        cars += 12;
        System.out.println("cars in parking lot = " + cars);

        //cars left the parking lot.
        cars -=11;
        System.out.println("cars in parking lot = " + cars);

        cars = cars -1;
        cars -=1;
        System.out.println("cars in the parking lot " +
                "= " + cars);

        int electricCars = 13;
        cars += electricCars;
        System.out.println("electric Cars in the parking lot = " + electricCars);

        String selenium = " but selenium is more fun";
        selenium += selenium;
        System.out.println("selenium = " + selenium);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        
        // add J to letter.
        letter += 'J';
        System.out.println("letter = " + letter);


        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        // early bird fee is 50% off.
        parkingFee /= 2;
        System.out.println("early bird parking Fee = " + parkingFee);
        
        
        // weekend parking is free.
        parkingFee -=parkingFee;
        System.out.println("weekend parking Fee = " + parkingFee);
        
        
    }
}
