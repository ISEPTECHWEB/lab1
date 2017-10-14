package ex01D;

import junit.framework.Test; 
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.*;

/** 
 * Unit test for simple App. 
 */
 public class CTest extends TestCase
 {
	protected static Logger log = Logger.getLogger(CTest.class);
	/** 
	 * Create the test case 
	 * 
	 * @param testName name of the test case 
	 */
	
	public void testMethod1() throws Exception // test method1 display i=0 et s=abcd
	{	
		int i = 0;
		StringBuffer s = new StringBuffer("abc"); 
		assertEquals(i, 0);
		C.method1(i, s); 
		assertEquals(i, 0); // test that i did'nt change
		log.debug("i="+i);
		assertEquals(s.toString(),"abcd"); // test that s has changed to abcd
		log.debug("s="+s); 
	}
 }
 