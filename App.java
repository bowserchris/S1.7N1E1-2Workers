package n1e1to2;

public class App {

	public static void main(String[] args) {
		
		/////Ejercicio 1///////

		WorkerOnSite onsite = new WorkerOnSite("bob", "jenkins", 15);
		WorkerOnline online = new WorkerOnline("sue", "perkins", 20);
		
		System.out.println("The monthly wage for " + onsite.getNameFirst() + " is " + onsite.calculateWage(160));
		System.out.println("The monthly wage for " + online.getNameFirst() + " is " + online.calculateWage(160));
		
		System.out.println("Is the override annotation present? " + onsite.getClass().getAnnotationsByType(Override.class));
		System.out.println("Is the override annotation present? " + online.getClass().getAnnotationsByType(Override.class));
		
		/*System.out.println("Is the override annotation present? " + online.getClass().getAnnotation(Override.class));			//returns null
		System.out.println("Is the override annotation present? " + online.getClass().isAnnotationPresent(Override.class));		//returns false
		System.out.println("Is the override annotation present? " + online.getClass().getAnnotationsByType(Override.class));	//returns [Ljava.lang.Override;@50675690
		System.out.println("Is the override annotation present? " + online.getClass().getDeclaredAnnotation(Override.class));	//returns null
		System.out.println("Is the override annotation present? " + online.getClass().isAnnotation());	*/						//returns false
		
		/////Ejercicio 2///////
		
		System.out.println(onsite.printWage());
		System.out.println(online.printWage());
		
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
}
 

