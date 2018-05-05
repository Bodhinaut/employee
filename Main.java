import java.util.ArrayList;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    //array list 
    private static ArrayList<Employee> staff;
    
  public static void main(String[] args) {
      //Employee e = new Employee(1, "one", "one"); --- cannot do this here do to abstract class
      // this is good for us as a designer so we can restrict access, 
      
      staff = new ArrayList<>();
      
      loadArrayListWithEmployees();
      displayEmployees();
    
  }
  
  public static void loadArrayListWithEmployees() {
      staff.add(new Salary(1, "Michael", "Tornaritis", 1000000.0) );
      staff.add(new Worker(2, "John", "Smith", 40.0, 10.0) );
      staff.add(new Salary(3, "Theo", "Smithe", 65000.0) );
      staff.add(new Worker(4, "Jane", "Eyre", 40.0, 30.0) );
      staff.add(new Worker(5, "Hannah", "Kornikova", 40.0, 50.0) );
      
      
  }
  
  public static void displayEmployees() {
      for (Employee e: staff) {
          System.out.println(e);
  }
}
}
