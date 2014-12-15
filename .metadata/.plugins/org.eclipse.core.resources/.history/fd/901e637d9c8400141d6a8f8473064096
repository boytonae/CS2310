package bibleApp;

import java.util.HashMap;
import exceptions.ChapterOutOfRangeException;

/**
 * 
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Book
{
	private String name;
	private HashMap<String, Segment> segments;
	 
	public Book(String name)
	{
		this.name = name;
		segments = new HashMap<String, Segment>();
	}
	public String toString()
	{
		return null;
	}
	public Segment getSegment(String index) throws ChapterOutOfRangeException
	{
		if(segments.get(index) != null)
		{
		return segments.get(index);
		}
		else
			throw new ChapterOutOfRangeException(index);
	}
	public int find(String search)
	{
		return 0;
	}
}