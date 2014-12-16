package bibleApp;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import exceptions.ChapterOutOfRangeException;
import exceptions.InvalidBookNameException;
import exceptions.VerseOutOfRangeException;
/**
 * The top-level class for this application.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Controller
{
	private HashMap<String, Book> books;
	private Scanner input;
	public Controller()
	{
		books = new HashMap<String, Book>();
		input = new Scanner(System.in);
		readFiles();
	}
	/**
	 * Retrieves a single line of user input
	 * @return The data entered by the user
	 */
	public String getInput()
	{
		return input.nextLine();
	}
	/**
	 * 
	 */
	public int find(String search)
	{
		return 0;
	}
	/**
	 * Retrieves a specified book from the collection..
	 * @param key The name of the book
	 * @return The corresponding Book object
	 * @throws InvalidBookNameException
	 */
	public Book getBook(String key) throws InvalidBookNameException
	{
		Book book = books.get(key);
		if (book != null) return books.get(key);
		else throw new InvalidBookNameException();
	}
	/**
	 * Reads the text files and adds them to the book collection.
	 */
	private void readFiles()
	{
		TextReader reader;
		File f = new File("assets/kjbible");
		String[] files = f.list();
		for (int i = 0; i < files.length; i++)
		{
			StringSplitter splitter = new StringSplitter();
			String name = files[i].replace(".txt", "");
			if (files[i].contains("Psalms"))
			{
				reader = new PsalmReader("assets/kjbible/" + files[i]);
				books.put(name, splitter.populatePsalmBook(reader.getTitle(), reader.getSegments()));
			}
			else
			{
				reader = new BookReader("assets/kjbible/" + files[i]);
				books.put(name, splitter.populateChapterBook(reader.getTitle(), reader.getSegments()));
			}
		}
	}
	/**
	 * Processes a line of user input.
	 * @param input The data entered by the user
	 */
	private void parseInput(String input)
	{
		if (input.equals("quit"))
		{
			System.exit(1);
		}
		else
		{
			if (input.contains(":"))
			{
				if (input.contains("-"))
				{
					//range of verses
					//split the input around the colon
					String[] initialSplit = input.split(Pattern.quote(":"));
					//split the first half into book and chapter
					String[] inputs = initialSplit[0].split(Pattern.quote(" "));
					//Split the second half into the start and end points
					String[] verseRange = initialSplit[1].split(Pattern.quote("-"));
					printSegmentVerseRange(inputs[0], inputs[1], verseRange[0], verseRange[1]);
				}
				else
				{
					//just one verse
					//split the input around the colon
					String[] initialSplit = input.split(Pattern.quote(":"));
					//split the first half into book and chapter
					String[] inputs = initialSplit[0].split(Pattern.quote(" "));
					printSegmentVerse(inputs[0], inputs[1], initialSplit[1]);
				}
			}
			else
			{
				//just a segment
				String[] inputs = input.split(Pattern.quote(" "));
				printSegment(inputs[0], inputs[1]);
			}
		}
	}
	/**
	 * Prints a segment to the console.
	 * @param bookID The book containing the segment
	 * @param segmentID The index of the segment
	 */
	private void printSegment(String bookID, String segmentID)
	{
		try
		{
			Book book = getBook(bookID);
			Segment result = book.getSegment(segmentID);
			System.out.println(result.toString());
		}
		catch (InvalidBookNameException | ChapterOutOfRangeException e)
		{
			System.err.println(e.getMessage());
		}
	}
	/**
	 * Prints a verse to the console.
	 * @param bookID The book containing the segment
	 * @param segmentID The segment containing the verse
	 * @param verseID The index of the verse
	 */
	private void printSegmentVerse(String bookID, String segmentID, String verseID)
	{
		try
		{
			Book book = getBook(bookID);
			Segment result = book.getSegment(segmentID);
			System.out.println(result.getVerse(Integer.parseInt(verseID)));
		}
		catch (InvalidBookNameException | ChapterOutOfRangeException | VerseOutOfRangeException e)
		{
			System.err.println(e.getMessage());
		}
	}
	/**
	 * Prints a range of verses to the console.
	 * @param bookID The book containing the segment
	 * @param segmentID The segment containing the verses
	 * @param firstVerseID The index of the first verse to be printed
	 * @param lastVerseID The index of the last verse to be printed
	 */
	private void printSegmentVerseRange(String bookID, String segmentID, String firstVerseID, String lastVerseID)
	{
		try
		{
			Book book = getBook(bookID);
			Segment result = book.getSegment(segmentID);			
			System.out.println(result.getRange(Integer.parseInt(firstVerseID), Integer.parseInt(lastVerseID)));
		}
		catch (InvalidBookNameException | ChapterOutOfRangeException | VerseOutOfRangeException e)
		{
			System.err.println(e.getMessage());
		}
	}
	/**
	 * The main method for this application.
	 */
	public static void main(String[] args)
	{
		Controller c = new Controller();
		String input = "";
		while (!input.equals("quit"))
		{
			System.out.println("Enter a thing");
			input = c.getInput();
			c.parseInput(input);
		}
	}
}