package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10); // true - 10 = 10
        System.out.println(1000 > 100); // 1000  > 100, true
        System.out.println(948 < 948575);
        System.out.println(10<= 11); // true. If there a second was 9, there was false.
        System.out.println(5>=3);
        System.out.println(100 != 44);
        
        boolean result = 5 == 5;
        System.out.println("result = " + result);
        
        result = 33 > 44;
        System.out.println("result = " + result);
        
        result = 10>= 10;
        System.out.println("result = " + result);
        
        result = 2!=2;
        System.out.println("result = " + result);
        
        String city = "Seattle";
        System.out.println("city = " + city);
        System.out.println(city == "baku"); // false
        System.out.println(city != "Fairfax"); // true
        
        String name = "Nadir";
        boolean checkName = name == "Nadir"; // true
        System.out.println("checkName = " + checkName);
        
        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);

    }
}
