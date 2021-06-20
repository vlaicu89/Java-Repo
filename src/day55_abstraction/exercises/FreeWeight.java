package day55_abstraction.exercises;

public class FreeWeight extends Lifting  {

    @Override
    public void perform() {
        System.out.println("Perform Free Weight dumbbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 29;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells" );

    }
}
