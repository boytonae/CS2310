package exceptions;
public class ChapterOutOfRangeException extends Exception
{
	private static final long serialVersionUID = -4909806628087061750L;
	public ChapterOutOfRangeException(String index)
	{
		super("Chapter " + index + " is out of range.");
	}
}