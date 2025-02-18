// ******************************************************************
//  Salesperson.java
//
//  Represent a sales person who has a first name, last
//  name, and total number of sales.
// ******************************************************************

public class Salesperson implements Comparable {
  private String firstName, lastName;
  private int totalSales;

  // ----------------------------------------------------
  // Constructor: Sets up the sales person object with
  //              the given data.
  // ----------------------------------------------------
  public Salesperson(String first, String last, int sales) {
    firstName = first;
    lastName = last;
    totalSales = sales;
  }

  // ---------------------------------------
  // Returns the sales person as a string.
  // ---------------------------------------
  public String toString() {
    return lastName + ", " + firstName + ": \t" + totalSales;
  }

  // ---------------------------------------
  // Returns true if the sales people have
  // the same name.
  // ---------------------------------------
  public boolean equals(Object other) {
    return (lastName.equals(((Salesperson) other).getLastName()) &&
        firstName.equals(((Salesperson) other).getFirstName()));
  }

  // --------------------------------------------
  // Order is based on total sales with the name
  // (last, then first) breaking a tie.
  // ------------------------------- -------------
  public int compareTo(Object other) {
    int result;
    // Complete the compareTo method in the Salesperson class. The comparison should be based on total sales
    Salesperson sales = (Salesperson) other;
    if (this.totalSales < sales.totalSales) {
      // return a negative number if the executing object has total sales less than the other object 
      result = -1;
    } else if (this.totalSales > sales.totalSales) {
      
      // return a positive number if the sales are greater
     result = 1;
    } else {
      result = this.lastName.compareTo(sales.lastName);
    }
    return result;
  }

  // --------------------
  // First name accessor
  // --------------------
  public String getFirstName() {
    return firstName;
  }

  // --------------------
  // Last name accessor
  // --------------------
  public String getLastName() {
    return lastName;
  }

  // --------------------
  // Total sales accessor
  // --------------------
  public int getTotalSales() {
    return totalSales;
  }
}