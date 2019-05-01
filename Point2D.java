
public class Point2D implements svg.element.Element {
	private double x;
	private double y;
public Point2D()
{
}
public double getX()
{
	return x;
}
public double getY()
{
	return y;
}
public void setX(double x)
{
	this.x = x;
}
public void setY(double y)
{
	this.y = y;
}

	@Override
	public boolean load(String expr) {
		if (expr.contains(" cx="))
		{
			final Double result = svg.SVGParser.extractDouble(expr, " cx=");
			if (result != null)
				cx = result.doubleValue();
		}

	}
}
