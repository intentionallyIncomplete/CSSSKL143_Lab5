/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Sets the color for objects created from Shape class.
 */
public class SimpleColor{

	//Class instance variables
	private int r;
	private int g;
	private int b;
	/*
	 * Instantiating a new ColorException object to throw later on when preventing 
	 * class invariants from override.
	 * */
	ColorException badColor = new ColorException();

	/**
	 * @return Red value in integer form of object assigned to objects 
	 * 'r' value in RBG sequence
	 */
	public int getR() {	return r;	}

	/**
	 * @param r
	 * Sets red value in accepted RGB format.
	 */
	public void setR(int r){
		if(r < 0 || r > 255) {
			System.out.println(badColor);
		}else {
			this.r = r;
		}
	}

	/**
	 * @return Get green value from RGB format
	 */
	public int getG() {	return g;	}

	/**
	 * @param g
	 * Set green value in accepted RGB format.
	 */
	public void setG(int g) {
		if(g < 0 || g > 255) {
			System.out.println(badColor);
		}else {
			this.g = g;
		}
	}

	/**
	 * @return Blue value in integer form of object assigned to objects 
	 * 'b' value in RBG sequence
	 */
	public int getB() {	return b;	}


	/**
	 * @param b
	 * Set blue value for accepted RBG format.
	 */
	public void setB(int b) {
		if(b < 0 || b > 255) {
			System.out.println(badColor);
		}else {
			this.b = b;
		}
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * 
	 * Calls to set() methods to prevent invariants and generate a precondition for
	 * future objects created using data from others that have a set color.
	 */
	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}

	/**
	 * Default constructor, takes no arguments and calls to set() methods
	 * to assign colors.
	 */
	public SimpleColor() {}

	/**
	 * @param r
	 * @param g
	 * @param b
	 * 
	 * 3 argument constructor takes in the red, green, and blue values needed to set the color some object.
	 */
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}

	/**
	 * @param b
	 * Copy constructor sets new SimpleColor to present values.
	 */
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
}
