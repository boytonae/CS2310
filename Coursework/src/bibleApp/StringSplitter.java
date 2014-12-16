package bibleApp;
import java.util.HashMap;
import java.util.regex.Pattern;
public class StringSplitter
{
	public StringSplitter()
	{

	}
	/**
	 * A method to convert a single string containing all the text in a book
	 * into segments and verses
	 * @param title - the title of the book
	 * @param allSegments - A String containing all of the segments in the book
	 * @return A book with the correct segments and verses
	 */
	public Book populateChapterBook(String title, String allSegments)
	{
		HashMap<String, Segment> segments = new HashMap<String, Segment>();
		String[] tempSegments = allSegments.split(Pattern.quote("CHAPTER"));
		for (int i = 0; i < tempSegments.length; i++)
		{
			Segment tempSegment = populateSegment(tempSegments[i]);
			// It should start from 0. Chapters are found by matching strings,
			// not integers.
			segments.put("" + i, tempSegment);
		}
		return new Book(title, segments);
	}
	/**
	 * A method to convert a single string containing all the text in a segment
	 * into verses
	 * @param allVerses - All the verses in this particular segment
	 * @return A segment with the correct verses
	 */
	private Segment populateSegment(String allVerses)
	{
		HashMap<String, String> verses = new HashMap<String, String>();
		String[] tempVerses = allVerses.split(Pattern.quote("\n"));
		// start from 1 to ignore the chapter title
		for (int i = 1; i < tempVerses.length; i++)
		{
			verses.put("" + i, tempVerses[i]);
		}
		return new Segment(verses);
	}
	/**
	 * A method to convert a single string containing all the text in the book
	 * of psalms into psalms and verses
	 * @param title - the title of the book
	 * @param allPsalms - A String containing all of the psalms in the book
	 * @return A book with the correct psalms and verses
	 */
	public Book populatePsalmBook(String title, String allPsalms)
	{
		HashMap<String, Segment> psalms = new HashMap<String, Segment>();
		String[] tempPsalms = allPsalms.split(Pattern.quote("PSALM"));
		for (int i = 0; i < tempPsalms.length; i++)
		{
			Psalm tempPsalm = populatePsalm(tempPsalms[i]);
			// i + 1 because chapters start from 1, not 0
			psalms.put("" + (i + 0), tempPsalm);
		}
		return new Book(title, psalms);
	}
	/**
	 * A method to convert a single string containing all the text in a psalms
	 * into verses, and decide if this psalm has a header
	 * @param allPsalms - All the verses in this particular psalm, and the
	 *        header, if there is one
	 * @return A Psalm with the correct verses and header. Header is null if
	 *         there is none
	 */
	private Psalm populatePsalm(String allPsalms)
	{
		HashMap<String, String> verses = new HashMap<String, String>();
		String[] tempVerses = allPsalms.split(Pattern.quote("\n"));
		String header = null;
		// start from 1 to ignore the chapter title
		for (int i = 1; i < tempVerses.length; i++)
		{
			// Check to see if the psalm has a header
			if (i == 1 && !tempVerses[i].contains("1"))
			{
				// if there is, set it to not null
				header = tempVerses[i];
			}
			else
			{
				if (header == null)
				{
					// if there is no header, the chapter numbering is the same
					// as the index numbering
					verses.put("" + i, tempVerses[i]);
				}
				else
				{
					// if there is a header, then the chapter numbering is one
					// less
					// than the index numbering
					verses.put("" + (i - 1), tempVerses[i]);
				}
			}
		}
		return new Psalm(header, verses);
	}
}