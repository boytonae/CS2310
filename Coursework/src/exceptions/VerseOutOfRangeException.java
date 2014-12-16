package exceptions;
public class VerseOutOfRangeException extends Exception
{
	private static final long serialVersionUID = 4887631288261615528L;
	public VerseOutOfRangeException()
	{
		super("Verse out of range.");
	}
}