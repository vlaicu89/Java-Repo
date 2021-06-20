package day55_abstraction.exercises;

public class Swimming extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing swimming exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 20;
    }
}
