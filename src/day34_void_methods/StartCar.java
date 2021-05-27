package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        // seat in car
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();


    }

    public static void seatInCar() {
        System.out.println("Open door and seat");

    }

    public static void pressGasPedal() {
        System.out.println("Press gas pedal and hold the steering wheel"); // we can mix them here, but they have to be
      //  in ordine acolo unde le declaram

    }

    public static void startTheCar() {
        System.out.println("Put the keys in ignition and start the car!");

    }

    public static void shiftToDrive() {
        System.out.println("Press the breake pedal and shift to D");

    }
}
