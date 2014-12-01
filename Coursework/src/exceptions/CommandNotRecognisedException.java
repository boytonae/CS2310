package exceptions;
public class CommandNotRecognisedException extends Exception
{
	private static final long serialVersionUID = -7720938769595684312L;
	public CommandNotRecognisedException()
	{
		super("Command not recognised.");
	}
}