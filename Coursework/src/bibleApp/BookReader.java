package bibleApp;
/**
 * A class to read text from a regular book.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class BookReader extends TextReader
{
	public BookReader(String file)
	{
		super(file);
		s.useDelimiter("\nCHAPTER");
		title = s.next();
		while (s.hasNext()) segments += "CHAPTER" + s.next();
	}
	/**
	 * @return The book's title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @return The book's chapters.
	 */
	public String getSegments()
	{
		return segments;
	}
}