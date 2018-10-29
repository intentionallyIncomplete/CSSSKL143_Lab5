import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/29/2018
 * 
 * Inherits from Shape class to use super()'s constructors and a radius for area.
 * 
 * */
public class Circle extends Shape{
	/*Class instance data members*/
	private double radius;

	/**
	 * @param x - Handed to super()
	 * @param y = Handed to super()
	 * @param radius - Used in equation of area
	 * Default constructor sends X and Y to super() class
	 * and assigns radius to present value of radius.
	 * */
	public Circle(int x, int y, double radius) {
		super(x,y);
		if(radius <=0 ) {
			System.out.println("Enter a radius larger than 0");
		}else {
			this.radius = radius;
		}
	}

	/**
	 * @return Returns present Circle's radius
	 * */
	public double getRadius() {
		return this.radius;
	}

	/**
	 * @param radius - double that represents a radius of a Circle which is a Shape
	 * */
	public void setR(double radius) {
		this.radius = radius;
	}

	/**
	 * @param radius
	 * @return Returns value of Circle's area. Overrides methos in super() class.
	 * */
	public double getArea(double radius) {
		return Math.PI * radius * radius;
	}

	/**
	 * @param g - Represents an object of type Graphics which takes arguments to draw on screen
	 */
	public void draw(Graphics g) {
		//Casting to Graphics2D object type
		Graphics2D g2d = (Graphics2D) g;
		
		//calling to super class
		final int x = getX(); 
		final int y = getY();
		
		g.drawOval(x, y, x, y);
	}
}
