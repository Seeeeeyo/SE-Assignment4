package svg.shape.concretes;

import svg.SVGParser;
import svg.element.Element;

public class LineTo extends PathOp{
	private double x;
	private double y;
	public LineTo()
	{
		super();
	}
	
	public Element newInstance() {
		return new LineTo();
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
