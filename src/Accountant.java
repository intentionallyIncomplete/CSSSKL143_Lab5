/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Inherits from SalariedWorker and builds an Accountant.
 */
public class Accountant extends SalariedWorker {

	public static final double ACCOUNTANT_MONTHLY = 8000;
	
	//private blocks this object from being created this way
	private Accountant() {}
	
	/**
	 * @param name
	 * @param social
	 * 
	 * The only way to make an Accountant is to specify the name and social, 
	 * or with the other constructor below that takes name, social, and pay
	 */
	public Accountant(String name, int social){	super(name, social, ACCOUNTANT_MONTHLY );	}
	
	/**
	 * @param name
	 * @param social
	 * @param monthlyPay
	 * 
	 * 
	 */
	public Accountant(String name, int social, double monthlyPay) {
		super(name, social, monthlyPay);
	}
}
