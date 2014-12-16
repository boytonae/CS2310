package bibleApp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * An abstract class to read text from a specified book.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public abstract class TextReader
{
	protected Scanner s;
	protected String title;
	protected String segments;
	public TextReader(String file)
	{
		try
		{
			s = new Scanner(new BufferedReader(new FileReader(file)));
		}
		catch (FileNotFoundException e)
		{
			System.err.println(e.getMessage());
		}
		title = "";
		segments = "";
	}
	/**
	 * @return The book's title
	 */
	public abstract String getTitle();
	/**
	 * @return The book's segments
	 */
	public abstract String getSegments();
}