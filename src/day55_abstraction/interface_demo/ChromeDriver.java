package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("Chrome getting the url to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chrome locating element by " + locator);

    }

    @Override
    public void quit() {
        System.out.println("Chrome quit");

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
