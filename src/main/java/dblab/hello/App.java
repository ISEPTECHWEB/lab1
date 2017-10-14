package dblab.hello;

/**
 *Hello world!
 *
 */
 
 public class App
 {
	
	public static void main(String[] args )
	{
		System.out.println( "Hello World!" );
		
		if (args.length >0) 
		{
			int i=0;
			for (String argument : args) // argument(s) that we pass through command line or with pom.xml
			{
				System.out.format("argument [%d]: %s %n", i++, argument);
			}
		}
	}
 }