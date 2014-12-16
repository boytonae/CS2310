package bibleApp;
import java.util.HashMap;
/**
 * A psalm is a segment of the Book of Psalms.
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Psalm extends Segment
{
	//header is null if there is none
	private String header;
	public Psalm(String header, HashMap<String, String> verses)
	{
		super(verses);
		this.header = header;
	}
	/**
	 * @return The contents of this psalm.
	 */
	public String toString()
	{
		if (header != null) return header + super.toString();
		else return super.toString();
	}
}