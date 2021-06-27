package day56_abstraction.driveble;

import day56_abstraction.speak.Greeting;

public  class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPilot() {
        System.out.println("Flying with the auto pilot");

    }

    @Override
    public void transportPeople() {
        System.out.println("Transport people to another location");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Cost of the ticket is: " +(mile * 26) + " to fly" + mile + "miles");
    }


    @Override
    public void hi() {
        System.out.println("Say hi!");

    }

    @Override
    public void bye() {
        System.out.println("Say bye bye!");

    }
}
