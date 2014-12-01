package exceptions;
public class ChapterOutOfRangeException extends Exception
{
	private static final long serialVersionUID = -4909806628087061750L;
	public ChapterOutOfRangeException()
	{
		super("Chapter out of range.");
	}
}