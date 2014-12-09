package bibleApp;
/**
 * 
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Controller
{
	//private Book books[];
	private TextReader reader;
	/**
	 * Constructor
	 */
	public Controller()
	{
		//books = new Book[66];
		reader = new TextReader("assets/kjbible/Genesis.txt");
		printToConsole(reader.readTitleC());
		printToConsole(reader.readChapters());
	}
	/**
	 * Prints the specified string to the console.
	 */
	public void printToConsole(String print)
	{
		System.out.print(print);
	}
	public String getInput()
	{
		return null;
	}
	/**
	 * Finds the specified word in all books.
	 * @param search
	 * @return The amount of times the word has occurred.
	 */
	public int find(String search)
	{
		return 0;
	}
	public Book getBook(int index)
	{
		return null;
	}
	//private void convertToIndex(String name)
	//{
	//	      
	//}
	public static void main(String[] args)
	{
		new Controller();
	}
}