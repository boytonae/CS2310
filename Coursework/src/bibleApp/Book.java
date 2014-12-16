package bibleApp;

import java.util.HashMap;
import java.util.LinkedList;
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
	public Segment getSegment(String index) throws ChapterOutOfRangeException
	{
		if(segments.get(index) != null)
		{
			return segments.get(index);
		}
		throw new ChapterOutOfRangeException(index);
	}
	public int find(String search)
	{
		LinkedList<String> results = new LinkedList<String>();
		int i = 0;
		int total = 0;									
		while (segments.containsKey(i)){
			segments.get(i).find(search, results);
		}
		return total;
				
	}
}