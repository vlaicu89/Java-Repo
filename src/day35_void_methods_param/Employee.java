package day35_void_methods_param;

public class Employee {
    public static void main(String[] args) {

    }

    //object variables
    String name, jobTitle;

    //object method

    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }

}
  class Company{
      public static void main(String[] args) {


          Employee employee1 = new Employee();
          employee1.name = "Serghei";
          employee1.jobTitle = "Tester";
          employee1.work();

          Employee employee2 = new Employee();
          employee2.name = "Diana";
          employee2.jobTitle = "Safety Manager";
          employee2.work();


      }
  }
