package bibleApp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * A class to read text from a specified file.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class TextReader
{
	private Scanner s;
	/**
	 * Constructor
	 * @param file The file path for the scanner.
	 */
	public TextReader(String file)
	{
		try
		{
			s = new Scanner(new BufferedReader(new FileReader(file)));
		}
		catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
            System.exit(1);
        }
	}
	/**
	 * @return The book's title
	 */
	public String readTitle()
	{
		s.reset();
		s.useDelimiter("\nCHAPTER");
		return s.next();
	}
	/**
	 * @return The book's chapters.
	 */
	public String readChapters()
	{
		s.reset();
		s.useDelimiter("\nCHAPTER");
		s.next();
		String text = "";
		while (s.hasNext()) text += "CHAPTER" + s.next();
		return text;
	}
}