package day55_abstraction.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        // can not create object in interface
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");
        chromeDriver.quit();
        chromeDriver.findElement("//input[@name='chrome']");
        System.out.println("chromeDriver.getTitle() = " + chromeDriver.getTitle());

    }
}
