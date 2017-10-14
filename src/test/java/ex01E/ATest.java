package ex01E;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.*;

/**
 * Unit test for simple App.
 */
 public class ATest extends TestCase
 {
	protected static Logger log = Logger.getLogger(ATest.class);
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public void testB() throws Exception
	{
		int x=10;
	}

	public void testC() throws Exception
	{
		A A = new A();
		A.m();

		B B = new B();
		B.m();

		C C = new C();
		C.m();

		C.test();
	}

 }
