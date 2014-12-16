package bibleApp;
import java.util.HashMap;
import exceptions.ChapterOutOfRangeException;
/**
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Book
{
	private HashMap<String, Segment> segments;
	public Book(String name, HashMap<String, Segment> segments)
	{
		this.segments = segments;
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
	 * Finds a specified search term in this book.
	 */
	public int find(String search, String title, int results)
	{

		int i = 0;
		while (segments.containsKey(i + ""))
		{
			results = segments.get(i + "").find(search, results, title, i);
			i++;
		}
		return results;
	}
}