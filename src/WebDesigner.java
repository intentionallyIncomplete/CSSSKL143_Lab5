/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 *
 * Inherits from SalariedWorker and builds a WebDesigner
 */
public class WebDesigner extends SalariedWorker {
	
	/**
	 * Class instance variables
	 */
	private static final int CONSULTANT_MONTHLY_PAY = 15000;
	
	/**
	 * @see Accountant default constructor that takes no arguments and prevents this
	 * type of Employee from being instantiated without data.
	 */
	private WebDesigner() {}
	
	/**
	 * @param name
	 * @param social
	 * @see Employee
	 * 
	 * Takes in name and social security number and sends to super() class
	 * for evaluation.
	 * Error checking on value of payment is done in super class constructor.
	 * If no monthly payment decided, use the base value.
	 */
	public WebDesigner(String name, int social) {	super(name,social,CONSULTANT_MONTHLY_PAY);	}
	
	/**
	 * @param name
	 * @param social
	 * @param monthlyPay
	 * 
	 * Constructor takes in name, social security number, and a custom payment amount.
	 */
	public WebDesigner(String name, int social, double monthlyPay) {	super(name, social,monthlyPay);	}
}
