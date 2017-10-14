package dblab.hello;

import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;
import org.apache.log4j.*;

/** 
 * Unit test for simple App. 
 */
 public class AppTest extends TestCase
 {
	protected static Logger log = Logger.getLogger(AppTest.class);
	/** 
	 * Create the test case 
	 * 
	 * @param testName name of the test case 
	 */
	
	public void testApp() throws Exception
	{
		String[] args = {"abc", "", " ", "1"};
		assertTrue(args.length>0); // test lenght array
		log.debug("test length of array - TRUE");
		assertFalse(args[1].length()>0);
		System.out.format("argument [%d]: %s %n", 3, args[3]); // test display
		log.debug("test display");
	}
 }
 