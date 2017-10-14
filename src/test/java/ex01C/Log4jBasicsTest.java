package ex01C;

import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;
import org.apache.log4j.*;

/** 
 * Unit test for simple App. 
 */
 public class Log4jBasicsTest extends TestCase
 {
	protected static Logger log = Logger.getLogger(Log4jBasicsTest.class);
	/** 
	 * Create the test case 
	 * 
	 * @param testName name of the test case 
	 */
	
	public void testLog4jBasics() throws Exception
	{
		log.info("info"); //test display log info
		log.debug("debug"); //test display log debug
	}
 }
 