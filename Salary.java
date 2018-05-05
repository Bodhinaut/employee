
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary extends Employee {
    private double annualSalary;
    
    public Salary (int eid, String firstName, String lastName, double annualSalary) {
        super(eid, firstName, lastName); // basic inheritance 
        setAnnualSalary(annualSalary);
    }
    
    public final double getAnnualSalary () {return annualSalary;}
    public final void setAnnualSalary (double annualSalary) {this.annualSalary = annualSalary;}
    // make the above fina in case they become a superclass and you dont want somone to override 
    @Override
    public String toString() {
        String str = "";
        
        str += "Salary: ";
        str += super.toString();
        str += "[" + String.format("$%.2f", annualSalary) + "]";
        str += "[" + String.format("$%.2f", pay() ) + "]";
    
        return str;
    }
    @Override 
    public double pay() {
        return annualSalary / (double)26; // type cast to double here , explicitly typecast , smart
    
    }
    // above providing implementation of payment for employeee, no issue now with not being abstract 
    // we are now conforming 
}
