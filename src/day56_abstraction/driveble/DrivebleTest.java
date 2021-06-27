package day56_abstraction.driveble;

public class DrivebleTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.transportPeople();
        model3.autoPilot();
        model3.cost(2);

        Plane plane = new Plane();
        plane.hi();
        plane.bye();
        plane.autoPilot();
        plane.cost(25);
    }
}
