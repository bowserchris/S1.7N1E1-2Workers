package n1e1to2;

public class WorkerOnline extends Worker {
	
	private final int FLAT_INTERNET_RATE;
	
	public WorkerOnline(String nameFirst, String nameLast, int pricePerHour) {
		super(nameFirst, nameLast, pricePerHour);
		this.FLAT_INTERNET_RATE = 100;
	}
	
	@Override
	public int calculateWage(int hoursMonth) {
		return super.calculateWage(hoursMonth) + FLAT_INTERNET_RATE;
	}
	
	/*
     * This method only prints wage, better use below
     * <p> Use {@link Utils#calculateWage(hoursMonth)} instead.
	 */
	@SuppressWarnings("deprecation")
	@Deprecated
	public String printWage() {
		return "Deprecated method in online worker";
	}

}

/*- Exercise 1

Create a hierarchy of objects with three classes: Worker, Online Worker and On-site Worker.

The Worker class has the attributes first name, last name, price/hour, and the calculateSou() 
method which receives as a parameter the number of hours worked and multiplies it by the price/hour. 
Child classes must override it, using @Override.

From the main() of the Main class, make the necessary invocations to demonstrate the operation 
of the @Override annotation.

In the case of face-to-face workers, the method to calculate their salary will receive as a 
parameter the number of hours worked per month. When calculating the salary, the number of hours 
worked will be multiplied by the price/hour, plus the value of a static attribute called petrol 
that we will add in this class.

For online workers, the method to calculate their salary will receive to parameter the number of 
hours worked per month. When calculating the salary, the number of hours worked will be multiplied
 by the price/hour and the price of the flat Internet rate will be added, which will be a constant
  of the Online Worker class.


- Exercise 2

Add to the child classes some obsolete (deprecated) methods, and use the corresponding annotation. 
It invokes the obsolete methods from an external class, suppressing through the corresponding annotation 
the "warnings" for being obsolete.

 */