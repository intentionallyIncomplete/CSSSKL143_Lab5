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
	ColorException badColor = new ColorException();

	/**
	 * @return Red value in integer form of object assigned to objects 
	 * 'r' value in RBG sequence
	 */
	public int getR() {	return r;	}

	/**
	 * @param r
	 */
	public void setR(int r){
		if(r < 0 || r > 255) {
			System.out.println(badColor);
		}else {
			this.r = r;
		}
	}

	/**
	 * @return Green value in integer form of object assigned to objects 
	 * 'g' value in RBG sequence
	 */
	public int getG() {	return g;	}

	/**
	 * @param g
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
	 * 
	 */
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	
	/**
	 * @param b
	 */
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
}
