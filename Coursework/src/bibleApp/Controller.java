package bibleApp;
/**
 * 
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Controller
{
	private Book books[];
	private TextReader reader;
	/**
	 * Constructor
	 */
	public Controller()
	{
		Book books[] = new Book[66];
		reader = new TextReader("assets/kjbible/Genesis.txt");
		System.out.print(reader.readText());
	}
	public String getInput()
	{
		return null;
	}
	public void printToConsole(String print)
	{
		System.out.print(print);
	}
	public int find(String search)
	{
		//Find a word X number of times.
		return 0;
	}
	public Book getBook(int index)
	{
		return null;
	}
	private void convertToIndex(String name)
	{
		      
	}
	/**

	 * The main method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Controller c = new Controller();
	}
}