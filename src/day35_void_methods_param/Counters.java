package day35_void_methods_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(19);
        int num2 = 999;
        count(num2);
        String word = "wooden spoon";
        count(word.length());
        printAge(1989);
        int birthYear = 2001;
        printAge(birthYear);

    }

    public static void count(int num) {
        for(int i = 0;i<=num;i++){
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void printAge(int year) {
        int age = 2021 - year;
        System.out.println("Birth year: " + year + " Age " + age);

    }
}
