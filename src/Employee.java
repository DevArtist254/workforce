public class Employee extends Worker {

    protected long employeeId;
    protected String hireDate;

    public Employee(String name, int birthYear, String endDate, long employeeId, String hireDate) {
        super(name, birthYear, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}
