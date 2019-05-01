package main;

import java.io.IOException;

import svg.SVGParser;

//-----------------------------------------------------------------------------

/**
 * Main class for the SVGLoader app.
 * KEN1520 Week 4 lab exercise.
 * @author cambolbro
 */
public class SVGLoader
{

	//-------------------------------------------------------------------------
		
	void run()
	{
		final SVGParser parser = new SVGParser();
	    final String fileName = "src/test-1.svg";
	
	    try { parser.loadAndParse(fileName); } 
		catch (IOException e) { e.printStackTrace(); }
	    
	    System.out.println(parser);
	}
	
	//-------------------------------------------------------------------------
	
	public static void main(final String[] args)
	{
		final SVGLoader loader = new SVGLoader();
		loader.run();
	}

	//-------------------------------------------------------------------------

}
