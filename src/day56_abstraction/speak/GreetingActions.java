package day56_abstraction.speak;

public class GreetingActions {
    public static void main(String[] args) {


        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greeting greeting = new MountainLanguage();
        ml.hi();
        ml.bye();
    }
}