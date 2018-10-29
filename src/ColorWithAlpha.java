/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/28/2018
 * 
 * The class is uses the methods of its super class SimpleColor to add another layer of customization.
 * The alpha integer will add transparency.
 */
public class ColorWithAlpha extends SimpleColor {

    /**
     * Instance variables for ColorWithAlpha
     * */
    private int alpha;
    private ColorException badValue = new ColorException();

    /**
     * @param alpha
     * Constructor takes in integer value to manipulate opacity
     */
    public ColorWithAlpha(int alpha){
	super(0,0,0);
	setAlpha(alpha);
    }

    /**
     * @param alpha
     * @param r
     * @param g
     * @param b
     * 
     * Takes in all values needed for RBG w/ alpha and calls super to set RGB.
     */
    public ColorWithAlpha(int alpha, int r, int g, int b){
	super(r, g, b);
	setAlpha(alpha);
    }

    /**
     * Copy constructor
     */
    public ColorWithAlpha(ColorWithAlpha cwa){
	this(cwa.alpha);
    }

    /**
     * @return Alpha value that determines level of opacity
     */
    public int getAlpha(){	return this.alpha;	}

    /**
     * @param alpha
     * Updates alpha value with handed value
     */
    public void setAlpha(int alpha){
	if(alpha < 0 || alpha > 255){
	    System.out.println(badValue);
	}else{
	    this.alpha = alpha;
	}
    }
    /**
     * @param other
     * @return boolean - Returns boolean value of method after checking if handed 
     * ColorWithAlpha object is the same as another.
     * */
    public boolean equals(ColorWithAlpha other){
	return (this.alpha == other.alpha && this.toString().equals(other.toString()));
    }

    /**
     * Overriding default toString() method.
     */
    public String toString() {
	return super.toString() + ", alpha:"+ alpha;
    }
}
