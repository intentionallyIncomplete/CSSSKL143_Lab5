/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Driver file the communicates to the other Color classes
 */
public class ColorDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testColorWithAlpha();
	}

	/**
	 * Main module used to hold functions that communicate to the other color classes.
	 */
	public static void testColorWithAlpha() {
		ColorWithAlpha a = new ColorWithAlpha(50);
		ColorWithAlpha b = new ColorWithAlpha(100,100,100,150);
		ColorWithAlpha c = new ColorWithAlpha(b);


		System.out.println( "a is " + a);
		System.out.println( "b is " + b.toString());
		System.out.println( "c is " + c.toString());


		System.out.println("a equals c: " + a.equals(c));
		System.out.println("b equals c: " + b.equals(c));


		//try some bad alpha values for exception handling
		try {
			a.setAlpha(300);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}


	}


}
