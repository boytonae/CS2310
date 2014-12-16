package bibleApp;
import java.util.HashMap;
import java.util.Stack;
import exceptions.ChapterOutOfRangeException;
/**
 * 
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Book
{
	private String title;
	private HashMap<String, Segment> segments;
	public Book(String name, HashMap<String, Segment> segments)
	{
		title = name;
		this.segments = segments;
	}
	public String toString()
	{
		return null;
	}
	/**
	 * Retrieves a specified segment from the book.
	 * @param index The index of the segment
	 * @return The corresponding segment
	 * @throws ChapterOutOfRangeException
	 */
	public Segment getSegment(String index) throws ChapterOutOfRangeException
	{
		if (segments.get(index) != null)
		{
			return segments.get(index);
		}
		else throw new ChapterOutOfRangeException(index);
	}
	/**
	 * 
	 */
	public Stack<String> find(String search)
	{
		Stack<String> results = new Stack<String>();
		int i = 0;								
		while (segments.containsKey(i))
		{
			results = segments.get(i).find(search, results, title, i);
			i++;
		}
		return results;			
	}
}