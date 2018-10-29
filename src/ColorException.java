/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/28/2018
 *
 * Used to demonstrate how to make basic classes quickly that handle errors effectively
 */
@SuppressWarnings("serial")
public class ColorException extends RuntimeException{

    /**
     * Default constructor.
     * Takes no arguments
     */
    public ColorException(){	super("An error occured in Color");	}

    /**
     * @param msg
     * Takes in String and builds exception with return message from super class
     * after handing it a String.
     */
    public ColorException(String msg) {	super(msg);	}
}
