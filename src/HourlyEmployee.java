public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, int birthYear, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthYear, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void retire(){

    }
}
