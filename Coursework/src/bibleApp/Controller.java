package bibleApp;
import java.io.File;
import java.util.HashMap;
/**
 * The top-level class for this application.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Controller
{
	private HashMap<String, Book> books;
	public Controller()
	{
		books = new HashMap<String, Book>();
		readFiles();
	}
	public void printToConsole(String print)
	{
		System.out.print(print);
	}
	public String getInput()
	{
		return null;
	}
	public int find(String search)
	{
		return 0;
	}
	public Book getBook(int index)
	{
		return null;
	}
	private void readFiles()
	{
		TextReader reader;
		File f = new File("assets/kjbible");
		String[] files = f.list();
		for (int i = 0; i < files.length; i++)
		{
			if (files[i].contains("Psalms")) reader = new PsalmReader("assets/kjbible/" + files[i]);
			else reader = new BookReader("assets/kjbible/" + files[i]);
			books.put(reader.getTitle(), new Book(""));
			printToConsole(reader.getSegments());
		}
	}
	private void convertToIndex(String name)
	{
		
	}
	public static void main(String[] args)
	{
		new Controller();
	}
}