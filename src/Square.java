import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Builds a Square and inherits data from Shape.
 */
public class Square extends Shape{
	/*Class instance data members*/
	private int sideLength;

	/**
	 * @param x
	 * @param y
	 * @param sideLength
	 * 
	 * Default constructor. Sends X and Y to super() class 
	 * and retains sideLength value for calculating area.
	 */
	public Square(int x, int y, int sideLength) {
		super(x,y);
		if(sideLength <= 0) {
			System.out.println("The length or width of a side cannot be 0 or less");
		}else {
			this.sideLength = sideLength;
		}
	}
	/**
	 * @return Returns integer value of present sideLength
	 * */
	public int getSideLength() {
		return this.sideLength;
	}
	/**
	 * Set the length of the side of the present Square
	 * */
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	/**
	 * Easy enough, a Square is simply Base * Height
	 * */
	public double getArea() {
		return sideLength * sideLength;
	}
	/**
	 * Override the draw() method in the abstract super() class.
	 * Draws sides of Squares that connect to make a shape.
	 * */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		final int x = getX();
		final int y = getY();
		
		//sideLength = base and height (a.k.a Length and Width)
		g.drawRect(x, y, sideLength, sideLength);
	}
}
