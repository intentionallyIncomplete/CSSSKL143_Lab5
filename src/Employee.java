/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Abstract keyword prevents any instantiating of this object.
 */

public abstract class Employee {
	/*Class level of variables*/
	private String name;
	private int social;

	/**
	 * No arguments taken in this constructor.
	 */
	public Employee() {}

	/**
	 * @param newName
	 * @param newSocial
	 * 
	 * Constructor that handles and assigns an employee's name and social security number
	 */
	public Employee(String newName, int newSocial) {
		name = newName;
		social = newSocial;
	}
	/**
	 * @return get name of present Employee
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 * Set name of Employee
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return get social for present Employee
	 */
	public int getSocial() {
		return social;
	}
	/**
	 * @param social
	 * Set social for Employee
	 */
	public void setSocial(int social) {
		this.social = social;
	}
	/**
	 * @return From Employee.java and overridden by other classes
	 * when creating Employee's
	 */
	public abstract double calculateWeeklyPay();
}