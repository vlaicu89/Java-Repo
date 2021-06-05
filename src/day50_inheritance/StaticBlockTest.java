package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); // runs only one time __>> 10+5
        StaticBlockDemo st2 = new StaticBlockDemo(); //+5
        StaticBlockDemo st3 = new StaticBlockDemo(); //+5
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);
    }

}
