package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.calculateSalary(55.0) ;
        System.out.println(".developer.calculator.salary(55) = " + developer.calculateSalary(55.0));
        double annualSalary = developer.calculateSalary(60.0);
        System.out.println("Math.round(annualSalary) = " + Math.round(annualSalary));

        Contractor sdetContractor = new Contractor();
        System.out.println("sdetContractor.calculateSalary(45) = " + sdetContractor.calculateSalary(45));
        System.out.println(developer.toString());


    }
}
