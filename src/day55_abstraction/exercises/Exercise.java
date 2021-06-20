package day55_abstraction.exercises;

public abstract class Exercise {

    // this is not an abstract method, non-abstract
    public void start() {
        System.out.println("Warming and starting the exercise");
    }
        public abstract void perform(); //his is an abstract method

       // another abstract method that concrete sub classes will override/implement
        public abstract int getCaloriesCount(int minutes);


}
