package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ali";
        p1.age = 12;
        p1.talk();
        p1.walk();
        p1.work("Sdet");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.walk();
        t1.teach(" math");

        Student student = new Student();
        student.name = "Ali";
        student.age = 23;
        student.walk();
        student.talk();
        student.study("math");
        student.work("java programing");
        student.school(2);

    }
}
