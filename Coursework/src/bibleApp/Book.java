package bibleApp;
/**
 * 
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Book
{
	private String name;
	private Segment segments[];
	/**
	 * Constructor
	 */
	public Book(String name, String segments)
	{
		this.name = name;
		this.segments = new Segment[1];
	}
	public String toString()
	{
		return null;
	}
	public String getName()
	{
		return name;
	}
	public Segment getSegment(int index)
	{
		return segments[index];
	}
	public int find(String search)
	{
		return 0;
	}
}