package ex01F;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.*;

/**
 * Unit test for simple App.
 */
 public class CircleTest extends TestCase
 {
	protected static Logger log = Logger.getLogger(CircleTest.class);
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */

	public void testCircle()
	{
		Circle c1 = new Circle(0,0, 5); // call class Circle to create a new instance c1
		Circle c2 = new Circle(0,0, 3); // call class Circle to create a new instance c2
		log.debug("C1 => " + c1);
    log.debug("C2 => " + c2);

    double a = 2 * java.lang.Math.PI * c2.radius;
		log.debug("C2 perimeter => " + a); // display perimeter
	}
 }
