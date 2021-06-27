package day56_abstraction.driveble;

public class Tesla extends Transportation implements SelfDrivable {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs: " + (mile * 0.10) + " to drive" + mile + " miles");

    }

    @Override
    public void autoPilot() {

    }
}
