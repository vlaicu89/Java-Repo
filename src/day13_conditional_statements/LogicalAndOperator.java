package day13_conditional_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false & false);

        System.out.println(10>5 && 1==1);
        System.out.println(14>4 && 1==3);
        System.out.println(3>2 &&5>2);

        int apples = 10, oranges = 5;
        boolean check = apples>5 && oranges>3;
        System.out.println("check: " + check);

        if(apples>6 && oranges>2){
            System.out.println("I have enough app and org");
        }else {
            System.out.println("i have to go to walmart");
        }
    }
}
