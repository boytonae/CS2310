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
	}
	/**
	 * @return The book's title
	 */
	public String readTitle()
	{
		s.reset();
		s.useDelimiter("\nPSALM");
		return s.next();
	}
	/**
	 * @return The book's psalms.
	 */
	public String readPsalms()
	{
		s.reset();
		s.useDelimiter("\nPSALM");
		s.next();
		String text = "";
		while (s.hasNext()) text += "PSALM" + s.next();
		return text;
	}
}