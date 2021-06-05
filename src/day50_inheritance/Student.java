package day50_inheritance;

public class Student extends Person{
    int studentID;

    public void school(int number){
        System.out.println("Student is studies at school number " + number);
    }
    public void study(String topic){
        System.out.println(name + "Student is study " + topic);
        System.out.println(age);


    }
}
