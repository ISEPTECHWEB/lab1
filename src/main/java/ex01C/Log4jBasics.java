package ex01C; 
import org.apache.log4j.*;

public class Log4jBasics
{
	protected static Logger log = Logger.getLogger(Log4jBasics.class);
	
	public static void main(String[] args) 
	{ 	
		log.debug("DEBUG: Cool !"); 
		log.info("INFO: Cool !"); 
	}	

}

// When we change the level from INFO to DEBUG, it prints the value of both log (info and debug). 
// We notice that there are different levels of logs depending on what we want to display: error, 
// value of avariable, ... (ordering level for log4j: DEBUG < INFO < WARN < ERROR < FATAL)