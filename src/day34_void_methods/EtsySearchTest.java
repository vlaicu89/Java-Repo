package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("Starting etsy search Smoke test");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        v();
        System.out.println("Starting etsy search Smoke test completed!");
    }

    public static void openBrowser() {
        System.out.println("Launching Chrome Browser");

    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigate to etsy.com");

    }

    public static void searchForWoodenSpoon() {
        System.out.println("Pass: Page succesfully displayed");
        System.out.println("Type '' wooden spoon'' in search");


    }

    public static void v() {
        System.out.println("Search results are succesfully displayed");

    }
}
