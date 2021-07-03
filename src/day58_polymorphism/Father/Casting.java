package day58_polymorphism.Father;

public class Casting {
    public static void main(String[] args) {
        // create object of superman and variable of worker
        Worker worker = new Superman();
        worker.work("Cacelini");
        worker.getPaid();

        ( (Father)worker).playWithKid();
        ((Superman)worker).playWithKid();

        // down casting from worker to superman

        Superman superman = (Superman) worker;
        superman.raiseKid();



    }
}
