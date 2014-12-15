package bibleApp;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * A segment is either a chapter or a psalm
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
	 * @return a string with all the verses
	 */
	public String toString()
	{
		int i = 1;
		StringBuilder result = new StringBuilder();
		while (verses.get(i+"") != null)
		{
			result.append(verses.get(i+""));
			i++;
		}
		
		return result.toString();
	}
	public String getRange(int start, int end)
	{
		StringBuilder result = new StringBuilder();
		for (int i = start; i <= end; i++)
		{
			result.append(verses.get(i + ""));
		}
		return result.toString();
	}
	
	public String getVerse(int index)
	{
		return verses.get(index + "");
	}
	
	public LinkedList<String> find(String search, LinkedList<String> results)
	{
		
		int i = 1;
		while (verses.get(i+"") != null)
		{
			String current = verses.get(i+"");
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