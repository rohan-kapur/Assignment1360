package cse360assignment02;
//rohan kapur assignment1 
public class AddingMachine {
  private int total;
  private String eq;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    eq = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  eq = eq + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  eq = eq + " - " + value;
  }

  public String toString () {
    return eq;
  }

  public void clear() {
	  total = 0;
	  eq = "0";
  }
}

