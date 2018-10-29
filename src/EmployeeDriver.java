import java.util.ArrayList;

/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Driver file that holds a list of Employee's and iterates over the roster.
 */
public class EmployeeDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Creating some Employees*/
		Accountant emp1 = new Accountant( "Rick", 123456789);
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);
		PermanentHire permEmp = new PermanentHire("Permanent Employee 1", 15909182);
		WebDesigner webDesigner = new WebDesigner("jsAddict", 91821590, 9500);
		
		//Building a list of Employee's
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();

		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		myEmployees.add(permEmp);
		myEmployees.add(webDesigner);

		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
	}
}
