

import org.apache.log4j.Logger;

public class Client
{
	final static Logger l=Logger.getLogger(Client.class);
	public static void main(String[] args)
	{
		l.debug("This is a debug message");
		l.info("This is a info message");
		l.warn("This is a warning message");
		l.error("This is a error message");
		l.fatal("This is a fatal message");

		System.out.println("Your logic executed successfully....");
	}
}
