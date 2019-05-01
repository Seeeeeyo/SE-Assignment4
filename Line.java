
public class Line extends svg.element.Shape.Shape {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	public Line()
	{
		super("Line");
	}
	
	public void setX1(double x1)
	{
		this.x1 = x1;
	}
	public void setY1(double y1)
	{
		this.y1 = y1; 
	}

	public void setX2(double x2)
	{
		this.x2 = x2;
	}
	public void setY2(double y2)
	{
		this.y2 = y2; 
	}
	public double getX1()
	{
		return x1;
	}
	public double getY1()
	{
		return y1;
	}
	public double getX2()
	{
		return x2;
	}
	public double getY2()
	{
		return y2;
	}

	@Override
	public Element newInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean load(String expr) {
		if(expr.contains(" x1=")) {
			final Double result = SVGParser.extractDouble(expr, " x1=");
			if(result != null) {
				x1= result.doubleValue();
			}
		}
		if(expr.contains(" y1=")) {
			final Double resultTwo = SVGParser.extractDouble(expr, " y1=");
			if(resultTwo != null) {
				y1 = resultTwo.doubleValue();
			}
		}
		if(expr.contains(" x2=")) {
			final Double resultThree = SVGParser.extractDouble(expr, " x2=");
			if(resultThree != null) {
				x2= resultThree.doubleValue();
			}
		}
		if(expr.contains(" y2=")) {
			final Double resultFour = SVGParser.extractDouble(expr, " y2=");
			if(resultFour != null) {
				y2 = resultFour.doubleValue();
			}
		}
		return false;
	}
	

}
