public class SalariedEmployee extends  Employee{
    private double weeklySalary;
    public SalariedEmployee(String name ,String family,
                            String socialSecurityNumber,
                            double weeklySalary){
        super(name,family,socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary>0.0){
            this.weeklySalary=weeklySalary;
        }else throw new IllegalArgumentException("weekly Salary Must be >0.0");
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee{ %s \n %s : $%.2f", super.toString(),
                "weekly Salary", getWeeklySalary());
    }
}
