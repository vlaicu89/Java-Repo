package day51_inheritance;

public class Contractor extends Employee {
     @Override // let know everyone that you override this method
     //
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{}";
    }
}