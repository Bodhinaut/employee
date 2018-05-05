import java.util.Objects;

/**
 * Once you make a method abstract, class becomes abstract
 * abstract class doesn't HAVE to have abstract method, 
 * abstract means no implementation, 
 */
public abstract class Employee {
   protected int eid;
   protected String firstName;
   protected String lastName;
   
   public abstract double pay();
   //above is prototype, method prototype or declaration
   // put abstract at very top or very bottom, to be seen easily
   
   // below is first protected constructor , need this to instatiate and use class, 
   protected Employee(int eid, String firstName, String lastName) {
       setEid(eid);
       setFirstName(firstName);
       setLastName(lastName);
   }
   // final is so the method cannot be overwritten 
   public final int getEid          () {return eid;      }
   public final String getFirstName () {return firstName;}
   public final String getLastName  () {return lastName; }
   
   public final void setEid       (int eid         ) {this.eid = eid;            }
   public final void setFirstName (String firstName) {this.firstName = firstName;}
   public final void setLastName  (String lastName ) {this.lastName = lastName;  }
   
   @Override
   public String toString() {
       String str = "";
   
       str += "[" + eid + "]" + "[" + firstName + lastName + "]";
   
       return str; 
   }
   // compare to is an odering and not just equality, compare to does quality as one of its three things
   @Override
   public boolean equals(Object o) {
       if ( o == null) {
           return false; // test because they cannot be the same
       }
       else if (this == o) {
           return true; // this would mean it is the same 
       } //below get descripton of class for object 
       else if (this.getClass() != o.getClass() ) {
           return false; // compare all properties to each other 
       } else {
           // must type cast to look at two employees
           Employee that = (Employee) o;
           // returning objects allows to ccompare fields, 
           return Objects.equals(this.eid, that.eid) &&
                  Objects.equals(this.firstName, that.firstName) &&
                  Objects.equals(this.lastName, that.lastName);
                  // if all three match we are good and it is the same employee 
                  // this should be part of something our classes should always have, 
                  // put things in order, are they the same, etc... 
       }
       // above, regular equals would not work, but we overrode it with out method, 
}
}
