
public class Worker extends Employee {
    private double hoursPerWeek;
    private double hourlyRate;
    
    public Worker(int eid, String firstName, String lastName, double hoursPerWeek, double hourlyRate) {
         super(eid, firstName, lastName);
         setHoursPerWeek(hoursPerWeek);
         setHourlyRate(hourlyRate);
    }
    
    public final double getHoursPerWeek() {return hoursPerWeek;}
    public final double getHourlyRate  () {return hourlyRate;  }
    
    public final void setHoursPerWeek (double hoursPerWeek) {this.hoursPerWeek = hoursPerWeek;}
    public final void setHourlyRate   (double hourlyRate)   {this.hourlyRate = hourlyRate;    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += "Worker: ";
        str += super.toString();
        str += "[" + String.format("Hours: %.1f, rate: $%.2f", hoursPerWeek, hourlyRate) + "]";
        str += "[" + String.format("$%.2f", pay() ) + "]";
    
        return str;
    }
    
    @Override
    public double pay() {
        return hoursPerWeek * hourlyRate;
    }
    
   
}
