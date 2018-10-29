/**
 * @author HumanOutput
 *
 * Will override the calculateWeeklyPay() method to find weekly value of salary.
 */
public class SalariedWorker extends Employee {
	private double monthlyPay;
	
	/**
	 * No argument constructor.
	 * Calls to super class's Employee no argument constructor.
	 */
	public SalariedWorker() {	super();	}
	
	/**
	 * @param name
	 * @param social
	 * 
	 * Sends name and social security value of SalariedWorker to Employee
	 */
	public SalariedWorker(String name, int social) {	super(name, social);	}
	
	/**
	 * @param name
	 * @param social
	 * @param pay
	 * 
	 * Constructor takes in name and social security number and hands to super class.
	 * Conditional statement checks if pay is valid amount, then assigns pay as monthly.
	 */
	public SalariedWorker(String name, int social, double pay) {
		super(name, social);
		
		if( pay > 0.0) {
			monthlyPay = pay;
		}
	}
	
	//Salaried means to be paid not hourly so calculateWeeklyPay() is used to 
	//generate an amount for weekly 
 	public double calculateWeeklyPay() {
		return monthlyPay/4;
	}
}
