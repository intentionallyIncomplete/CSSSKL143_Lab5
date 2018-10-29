/*
 * SalariedWorker.java
 * This worker calculates her weekly pay differently than a hourly worker does, so we override the calculateWeeklyPay method
 */

/**
 * @author HumanOutput
 *
 * Will override the calculateWeeklyPay() method to determine the 
 */
public class SalariedWorker extends Employee {
	private double monthlyPay;
	
	/**
	 * No argument constructor.
	 * Calls to super class Employee no argument constructor.
	 */
	public SalariedWorker() {
		super();
	}
	
	/**
	 * @param name
	 * @param social
	 * 
	 * 
	 */
	public SalariedWorker(String name, int social) {
		super(name, social);
	}
	
	/**
	 * @param name
	 * @param social
	 * @param pay
	 * 
	 * Constructor takes in name and social security number and hands to super class.
	 * Conditional statement checks if pay is valid amount.
	 */
	public SalariedWorker(String name, int social, double pay) {
		super(name, social);
		
		if( pay > 0.0) {
			monthlyPay = pay;
		}
	}
	
	//Salaried means to be paid not hourly. In this case, monthly.
	public double calculateWeeklyPay() {
		return monthlyPay/4;
	}
}
