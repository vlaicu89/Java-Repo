package day55_abstraction.exercises;

public class Running extends Exercise {


    @Override
    public void perform() {
        System.out.println("Performing Running exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;  // calories per minute
    }
}
