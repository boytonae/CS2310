package bibleApp;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import exceptions.ChapterOutOfRangeException;
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

	public String getInput()
	{
		return input.nextLine();
	}
	public int find(String search)
	{
		return 0;
	}
	public Book getBook(String key)
	{
		return books.get(key);
	}
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
	/*
	private void convertToIndex(String name)
	{
		
	}
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
	
	private void printSegment(String bookID, String segmentID)
	{
		Book book = getBook(bookID);
		try
		{
			Segment result = book.getSegment(segmentID);
			System.out.println(result.toString());
		}
		catch (ChapterOutOfRangeException e) {}
	
		
	}
	
	private void printSegmentVerse(String bookID, String segmentID, String verseID)
	{
		
	}
	
	private void printSegmentVerseRange(String bookID, String segmentID, String firstVerseID, String lastVerseID)
	{
		
	}
}