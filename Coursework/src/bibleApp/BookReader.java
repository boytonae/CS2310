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
	}
	/**
	 * @return The book's title
	 */
	public String readTitle()
	{
		s.reset();
		s.useDelimiter("\nCHAPTER");
		return s.next();
	}
	/**
	 * @return The book's chapters.
	 */
	public String readChapters()
	{
		s.reset();
		s.useDelimiter("\nCHAPTER");
		s.next();
		String text = "";
		while (s.hasNext()) text += "CHAPTER" + s.next();
		return text;
	}
}