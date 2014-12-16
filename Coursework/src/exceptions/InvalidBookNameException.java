package exceptions;
public class InvalidBookNameException extends Exception
{
	private static final long serialVersionUID = -2441213664653642323L;
	public InvalidBookNameException()
	{
		super("The book you have entered does not exist.");
	}
}