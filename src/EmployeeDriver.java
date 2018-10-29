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
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);

		//todo: Build some PermanentHire and Consultant objects here
		//and add them to the ArrayList below

		//Building a list of Employee's
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();

		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		//todo: add a sixth and seventh employee to this list that you create
		

		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
	}
}
