public class BasePlusCommissionEmployee extends CommissonEmployee{
    private double baseSalary;// حقوق پایه

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
     if (baseSalary>0.0){
         this.baseSalary=baseSalary;
     }else throw  new IllegalArgumentException("Base Salary muse be >0.0");
       // or  this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString(){
        return String.format("Base_Salary %s\n%s : $%.2f ",super.toString(),"Base Salary ",getBaseSalary());
    }

    public BasePlusCommissionEmployee(String name, String family, String socialSecurityNumber, double grossSales
    , double commissionRate, double baseSalary){
        super(name, family, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }


}
