package bibleApp;

import java.util.Scanner;

public class TextReader
{
	@SuppressWarnings("unused")
	private Scanner s;
	public TextReader(String pathFile)
	{
		s = new Scanner(pathFile);
		
	}
}