
package svg.shape.concretes;
import svg.element.Element;
import svg.element.Shape.Shape;


public class Circle extends Shape{
	private double cx;
	private double cy;
	private double r;
	
	public Circle(
	{
		super("Circle");
	}
	public double getCX()
	{
		return cx;
	}
	public double getCY()
	{
		return cy;
	}
	public double getR()
	{
		return r;
	}
	public void setCX(double cx)
	
	{
	this.cx = cx;
	}
	public void setCY(double cy)
	{
		this.cy = cy;
	}
	public void setR(double radius)
	{
		r = radius;
	}
	@Override
	public Element newInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean load(String expr) {
		if(expr.contains(" cx=")) {
			final Double result = SVGParser.extractDouble(expr, " cx=");
			if(result != null) {
				cx = result.doubleValue();
			}
		}
		if(expr.contains(" cy=")) {
			final Double resultTwo = SVGParser.extractDouble(expr, " cy=");
			if(resultTwo != null) {
				cy = resultTwo.doubleValue();
			}
		}
		if(expr.contains(" r=")) {
			final Double resultThree = SVGParser.extractDouble(expr, " r=");
			if(resultThree != null) {
				r = resultThree.doubleValue();
			}
		}
		
		return false;
	}

}

