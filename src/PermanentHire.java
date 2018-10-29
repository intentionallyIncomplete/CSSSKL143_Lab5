/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 *
 * PermanentHire is a SalariedWorker which is a type of Employee.
 * Has a similar constructor style to Accountant, WebDesigner, and Intern.
 */
public class PermanentHire extends SalariedWorker{
	/**
	 * Class data members 
	 */
	private static final int WEEKLY_SALARY_BONUS = 350;
	private static final int MONTHLY_PAY = 9500;
	
	/**
	 * @see Accountant
	 * @see WebDesigner
	 * @see Intern
	 */
	private PermanentHire() {}
	
	/**
	 * @param name
	 * @param social
	 * 
	 * Takes in name of permanent Employee and social security value.
	 * Values are sent to super class for processing.
	 */
	public PermanentHire(String name, int social) {
		super(name,social,MONTHLY_PAY);
	}

	public double calculateWeeklyPay() {
		return MONTHLY_PAY/4 + WEEKLY_SALARY_BONUS;
	}
}
