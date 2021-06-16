package day54_abstraction;

public class OnlineStudent extends Student{
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using zoom");
    }
    //public abstract void askQuestions(); --->>> error, because we dont have the method in parent class
}
