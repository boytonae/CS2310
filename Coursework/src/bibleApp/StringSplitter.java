package bibleApp;

import java.util.HashMap;
import java.util.regex.Pattern;

public class StringSplitter
{
	public StringSplitter()
	{
		
		
	}
	
	public Book populateChapterBook(String title, String allSegments)
	{
		HashMap<String, Segment> segments = new HashMap<String, Segment>();
		
		String[] tempSegments = allSegments.split(Pattern.quote("CHAPTER"));
		
		for (int i = 0; i < tempSegments.length; i++)
		{
			Segment tempSegment = populateSegment(tempSegments[i]);
			//i + 1 because chapters start from 1, not 0
			segments.put("" + (i + 1), tempSegment);
		}
		
		return new Book(title, segments);
	}
	
	private Segment populateSegment(String allVerses)
	{
		HashMap<String, String> verses = new HashMap<String, String>();
		
		String[] tempVerses = allVerses.split(Pattern.quote("\n"));
		
		//start from 1 to ignore the chapter header 
		for (int i = 1; i < tempVerses.length; i++)
		{
			
		}
		
		return new Segment(verses);
	}
}