/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 *
 * An intern usually implies no salary but often has have hourly payment conditions.
 * This class builds an intern and inherits methods and data from HourlyWorker
 * to make this type of Employee.
 */
public class Intern extends HourlyWorker{
	/**
	 * Final value used in place of a custom value for when
	 * worker earns the legal minimum per hour.
	 */
	private static final int MINIMUM_HOURLY_WAGE = 15;
	
	/**
	 * @see Accountant
	 * @see Consultant
	 */
	private Intern() {}

	/**
	 * @param name
	 * @param social
	 * 
	 * Takes in name and social security number, then uses minimum wage to determine
	 * value of weeklyPay in HourlyPay.
	 */
	public Intern(String name, int social) {	
		super(name, social, MINIMUM_HOURLY_WAGE);
	}
	
	/**
	 * @param name
	 * @param social
	 * @param hourlyPay
	 * 
	 * Takes in name, social, and custom hourlyPay rate to determine weeklyPay.
	 */
	public Intern(String name, int social, double hourlyPay) {
		super(name, social, hourlyPay);
	}
}
