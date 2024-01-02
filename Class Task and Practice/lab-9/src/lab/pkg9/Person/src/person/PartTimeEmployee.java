/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Asus
 */
public class PartTimeEmployee extends Employee {
    private double hours;
    private double rate;

    public PartTimeEmployee(double hours, double rate, String department, String designation, String name, int age, String address) {
        super(department, designation, name, age, address);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double salary()
    {
        double monthlyIncome=(getHours()*getRate());
        return monthlyIncome;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "hours=" + hours + ", rate=" + rate + ", Department="+super.getDepartment()+ 
             ", Designation="+super.getDesignation()+", Name="+super.getName()+", Age="+super.getAge()+ ",Address=" +super.getAddress()+'}';
    }
    
    
}
