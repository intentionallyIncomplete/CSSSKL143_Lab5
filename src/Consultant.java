/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 *
 * Builds a Consultant which is an HourlyWorker.
 */
public class Consultant extends HourlyWorker{
	/*Class instance data members*/
	private static final int CONSULTANT_HOURLY_WAGE = 3;

	/**
	 * Private constructor prevents creating of this type of HourlyWorker
	 * without data.
	 */
	private Consultant() {}

	/**
	 * @param name
	 * @param social
	 * 
	 * Takes only a name and social security value and uses default monthly wage
	 * to construct a Consultant Employee.
	 * */
	public Consultant(String name, int social) {	super(name,social,CONSULTANT_HOURLY_WAGE);	}

	/**
	 * @param name
	 * @param social
	 * @param monthlyPay
	 * 
	 * Takes in a custom pay value along with a name and social security number
	 * that are all handed to the super class's constructor for evaluation.
	 */
	public Consultant(String name, int social, double hourlyPay) {	super(name,social,hourlyPay);	}

	/**
	 * Overrides the calculateWeeklyPay method found in super class.
	 * */
	public double calculateWeeklyPay() {	return CONSULTANT_HOURLY_WAGE * 20 * 5;	}
}
