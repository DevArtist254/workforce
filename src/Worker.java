public class Worker {

    protected String name;
    protected int birthYear;
    protected String endDate;
    public Worker(){

    }

    public Worker(String name, int birthYear, String endDate) {
        this.name = name;
        this.birthYear = birthYear;
        this.endDate = endDate;
    }

    public int getAge(){

        return 0;
    }

    public double collectPay() {

        return 0.0;
    }

    public void terminate(String endDate){
        System.out.println(endDate);
    }
}
