package day58_polymorphism.Father;

public class SuperManTest {
    public static void main(String[] args) {
     Father sp1 = new Superman();
     sp1.feedKid();
     sp1.playWithKid();
     sp1.playWithKid();

     Worker sp2 = new Superman();
     sp2.getPaid();
     sp2.work("SDET");

     Superman sp3 = new Superman();
     sp3.getPaid();
     sp3.feedKid();
     sp3.work("Maler");
     sp3.raiseKid();

    }
}
