package day47_constructors;

public class Student {
    public Student(){
        System.out.println("No-Args Constructor");
    }
    public Student(String name){
        System.out.println("name param constructor= " + name);

}
    public Student(int age){
    System.out.println("age param constructor= " + age);
}
    public Student(String name, int age){
        System.out.println("name and age constructor = " + name + age);
    }
}