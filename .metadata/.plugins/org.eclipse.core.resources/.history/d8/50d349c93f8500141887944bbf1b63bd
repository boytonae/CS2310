package bibleApp;
import java.util.HashMap;
import java.util.Stack;
import exceptions.VerseOutOfRangeException;
/**
 * A segment is either a chapter or a psalm.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Segment
{
	protected HashMap<String, String> verses;
	public Segment(HashMap<String, String> verses)
	{
		this.verses = verses;
	}
	/**
	 * @return A string with all the verses
	 */
	public String toString()
	{
		int i = 1;
		StringBuilder result = new StringBuilder();
		while (verses.get(i + "") != null)
		{
			result.append(verses.get(i + ""));
			i++;
		}
		return result.toString();
	}
	/**
	 * Retrieves a range of verses.
	 * @param start The first verse to be retrieved
	 * @param end The last verse to be retrieved
	 * @return The range of verses between start and end, inclusive
	 * @throws VerseOutOfRangeException
	 */
	public String getRange(int start, int end) throws VerseOutOfRangeException
	{
		StringBuilder result = new StringBuilder();
		for (int i = start; i <= end; i++)
		{
			result.append(verses.get(i + ""));
		}
		if (result.toString() == null)
		{
			throw new VerseOutOfRangeException();
		}
		return result.toString();
	}
	/**
	 * Retrieves a single verse.
	 * @param index The index of the verse to be retrieved
	 * @return The contents of the verse
	 * @throws VerseOutOfRangeException
	 */
	public String getVerse(int index) throws VerseOutOfRangeException
	{
		String temp = verses.get(index + "");
		if (temp == null)
		{
			throw new VerseOutOfRangeException();
		}
		return verses.get(index + "");
	}
	
	public Stack<String> find(String search, Stack<String> results)
	{
		int i = 1;
		while (verses.get(i + "") != null)
		{
			String current = verses.get(i + "");
			if (current.contains(search))
			{
				String location = "";
				//somehow get book name and chapter
				location += ":" + i;
				results.add(location);
				
			}
			i++;
		}
		return results;
	}
}