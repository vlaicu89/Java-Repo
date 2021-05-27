package day45_OOP;

public class TrafficLightObject {
    public static void main(String[] args) {
        // we creating traffic light object
        TrafficLight trafficLight = new TrafficLight();
      //  trafficLight.color = "red";  ---->>>don't do like this, is not a good practice.
        trafficLight.changeColor("red");

        //call method to access the variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("black");
        trafficLight2.showColor();
    }
}
