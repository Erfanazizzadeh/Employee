public class Main {
    public static void main(String[] args) {
        System.out.println("Employee processed individually : ");
        SalariedEmployee salariedEmployee = new SalariedEmployee("erfan","lee","3344"
                ,800000);
        CommissonEmployee commissonEmployee = new CommissonEmployee("Jack","Ar","2553435",
                95.0000,0.56);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mamad","Li","444332",15.000,90.0);
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Erfan","Az",
            "999345",98.0000,0.50,900.000);

    System.out.println(salariedEmployee + "\n");
        System.out.println(commissonEmployee + "\n");
        System.out.println(hourlyEmployee + "\n");
        System.out.println(basePlusCommissionEmployee + "\n");
        System.out.println("Employees processed polymorphically \n");
        Employee [] employees = new Employee[4];
        employees[0]= salariedEmployee;
        employees[1]= commissonEmployee;
        employees[2]= hourlyEmployee;
        employees[3]= basePlusCommissionEmployee;
        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);
        }

    }
}
