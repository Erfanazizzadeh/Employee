public class HourlyEmployee extends  Employee{
    private double hour;
    private double wage;//دستمزد ساعتی

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if (hour>0.0 && hour<168.0) {
            this.hour = hour;
        }else throw new IllegalArgumentException("Hour must be hour>0.0 && hour<168.0");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
       if (wage>0.0){
           this.wage=wage;
       }else {
           throw  new IllegalArgumentException(" Wage must be >0.0 ");
       }
    }

    public HourlyEmployee(String name , String family,
                          String socialSecurityNumber, double hour, double wage){
        super(name, family, socialSecurityNumber);
        setHour(hour);
        setWage(wage);


    }

    @Override
    public double earnings() {
        if (getHour()<=40.0)
             return getWage()*getHour();
        else
        return (getWage() *40 )+ ((getHour()-40.0) * getWage()*1.5);
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee : %s\n %s  : $%.2f\n%s  : $%.2f",
        super.toString(),"Hourly Wage",getWage(),"Hours worked", getHour());
    }
}
