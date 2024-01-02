
package person;

public class Employee extends Person{
    private String department;
    private String designation;

    public Employee(String department, String designation, String name, int age, String address) {
        super(name, age, address);
        this.department = department;
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" + "department=" + department + ", designation=" + designation + '}';
    }
    
    
    
}
