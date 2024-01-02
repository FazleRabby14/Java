
package person;


public class FullTimeEmployee extends Employee{
    private double basic;
    private double allowance;

    public FullTimeEmployee(double basic, double allowance, String department, String designation, String name, int age, String address) {
        super(department, designation, name, age, address);
        this.basic = basic;
        this.allowance = allowance;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    
    public double salary()
    {
       double income=(getBasic()+getAllowance()*getBasic());
        return income;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "basic=" + basic + ", allowance=" + allowance + ", Department="+super.getDepartment()+ 
         ", Designation="+super.getDesignation()+", Name="+super.getName()+", Age="+super.getAge()+ ",Address=" +super.getAddress()+ '}';
    }
    
    
    
}
