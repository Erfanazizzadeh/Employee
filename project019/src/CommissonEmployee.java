public class CommissonEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales>0.0) {
            this.grossSales = grossSales;
        }else throw new IllegalArgumentException("Gross sales must be >0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate>0.0 && commissionRate<1.0) {
            this.commissionRate = commissionRate;
        }else throw new IllegalArgumentException(" commissionRate must be >0.0 or 1.0");
    }

    public CommissonEmployee(String name , String family,
                             String socialSecurityNumber,
                             double grossSales, double commissionRate){
      super(name, family, socialSecurityNumber);
      setCommissionRate(commissionRate);
      setGrossSales(grossSales);

    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("Commision Employee :  %s \n %s : $%.2f \n : %s  : $%.2f" , super.toString(),
                "gross Sales ",getGrossSales(),"Commission Rate ", getCommissionRate());
    }
}
