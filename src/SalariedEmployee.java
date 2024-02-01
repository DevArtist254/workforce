public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, int birthYear, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthYear, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void getDoublePay() {

    }
}
