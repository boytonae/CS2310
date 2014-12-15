package bibleApp;
/**
 * A class to read text from the Book of Psalms.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class PsalmReader extends TextReader
{
	public PsalmReader(String file)
	{
		super(file);
		s.useDelimiter("\nPSALM");
		title = s.next();
		while (s.hasNext()) segments += "PSALM" + s.next();
		segments += "\n\n";
	}
	/**
	 * @return The book's title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @return The book's psalms.
	 */
	public String getSegments()
	{
		return segments;
	}
}