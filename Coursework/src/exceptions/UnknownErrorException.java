package exceptions;
public class UnknownErrorException extends Exception
{
	private static final long serialVersionUID = -8631425323624976168L;
	public UnknownErrorException()
	{
		super("An unknown error has occurred.");
	}
}