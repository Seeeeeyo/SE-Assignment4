package svg.shape.concretes;

import svg.SVGParser;
import svg.element.Element;

public class CubicTo extends PathOp{
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	
	 
	public CubicTo()
	{
		super();
		
	}
	public Element newInstance() {
		return new CubicTo();
	}
	
	public boolean load(final String expr) {
		if (expr.contains("x1=")) {
			final Double result = SVGParser.extractDouble(expr, "x1=");
			if (result != null) {
				x1 = result.doubleValue();
			}
		}
		if (expr.contains("y1=")) {
			final Double resultTwo = SVGParser.extractDouble(expr, "y1=");
			if (resultTwo != null) {
				y1 = resultTwo.doubleValue();
			}
		}
		if (expr.contains("x2=")) {
			final Double resultThree = SVGParser.extractDouble(expr, "x2=");
			if (resultThree != null) {
				x2 = resultThree.doubleValue();
			}
		}
		if (expr.contains("y2=")) {
			final Double resultFour = SVGParser.extractDouble(expr, "y2=");
			if (resultFour != null) {
				y2 = resultFour.doubleValue();
			}
		}
		if (expr.contains("x3=")) {
			final Double resultFive = SVGParser.extractDouble(expr, "x3=");
			if (resultFive != null) {
				x3 = resultFive.doubleValue();
			}
		}
		if (expr.contains("y3=")) {
			final Double resultSix = SVGParser.extractDouble(expr, "y3=");
			if (resultSix != null) {
				y3 = resultSix.doubleValue();
			}
		}
		return false;
	} 

	
}
