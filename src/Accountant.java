/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * 
 */
public class Accountant extends SalariedWorker {

	public static final double ACCOUNTANT_MONTHLY = 8000;
	
	//private blocks this object from being created this way
	private Accountant() {}
	
	//the only way to make an Accountant is to specify the name and social, or with the other constructor below that takes name, social, and pay
	/**
	 * @param name
	 * @param social
	 * 
	 * 
	 */
	public Accountant(String name, int social){
		super(name, social, ACCOUNTANT_MONTHLY );
	}
	
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
