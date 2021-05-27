package day36_methods_with_return;

public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("full name: " + fullName());
        isMarried();
        System.out.println("Her status: "+  isMarried());
        getAge();
        System.out.println("Your age is: "+ getAge());
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);


    }

    public static String fullName() {
        return "Mike Smith";

    }

    public static boolean isMarried() {
          return false;

        }

    public static int getAge() {
        int age = 35;
        return age;

    }

    }

