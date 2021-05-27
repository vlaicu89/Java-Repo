package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
       // car1.model = "Nissan Altima"; --->>> model and year are private and can not be accessed for other classes
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMillage(8300);
        System.out.println("car1 millage = " + car1.getMillage());

        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Giulia");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMillage(22333);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMillage());

        System.out.println(alfaRomeo);

    }
}
