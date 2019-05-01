package svg.shape;

import svg.SVGParser;
import svg.element.Element;

public class MoveTo {
	private double x;
	private double y;
	
	public MoveTo()
	{
		super();
	}
	
	public Element newInstance() {
		return (Element) new MoveTo();
	}
	
	public boolean load(final String expr) {
		if (expr.contains("x=")) {
			final Double result = SVGParser.extractDouble(expr, "x=");
			if (result != null) {
				x = result.doubleValue();
			}
		}
		if (expr.contains("y=")) {
			final Double resultTwo = SVGParser.extractDouble(expr, "y=");
			if (resultTwo != null) {
				y = resultTwo.doubleValue();
			}
		}
		return false;
	} 
}
