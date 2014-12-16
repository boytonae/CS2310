package bibleApp;

import java.util.HashMap;

/**
 * 
 * @author Norfolk-in-Chance (Thomas Slate, Jack Taylor, Abigail Boyton)
 */
public class Psalm extends Segment
{
	//header is null if there is none
	private String header;

	/**
	 * Constructor
	 */
	public Psalm(String header, HashMap<String, String> verses)
	{
		super(verses);
		this.header = header;
	}
	
	public String toString()
	{
		if (header != null)
		{
			return header + super.toString();
		}
		else
		{
			return super.toString();
		}
	}
}