package bibleApp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * A class to read text from a specified file.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton
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
	        s.useDelimiter("[^a-zA-Z0-9]+");
		}
		catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
            System.exit(1);
        }
	}
}