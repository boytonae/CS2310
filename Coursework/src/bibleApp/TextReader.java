package bibleApp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class TextReader
{
	private Scanner s;
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