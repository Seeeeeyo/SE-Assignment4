package svg;

import java.util.ArrayList;
import java.util.List;

import svg.element.Element;

//-----------------------------------------------------------------------------

/**
 * Contents of an SVG file. 
 * @author cambolbro
 */
public class SVG
{
	private final List<Element> elements = new ArrayList<Element>();

	//-------------------------------------------------------------------------
	
	public List<Element> elements()
	{
		return elements;
	}
	
	//-------------------------------------------------------------------------

	public void clear()
	{
		elements.clear();
	}
	
	//-------------------------------------------------------------------------

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder();
		
		sb.append(elements.size() + " elements:\n");
		for (Element element : elements)
			sb.append(element + "\n");
		
		return sb.toString();
	}

	//-------------------------------------------------------------------------
	
}
