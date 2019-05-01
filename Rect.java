
public class Rect extends Shape{
	private double x;
	private double y;
	private double rx;
	private double ry;
	private double width;
	private double height;
	public Rect()
	{
		super("Rectangle");
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getRX()
	{
		return rx;
	}
	public double getRY()
	{
		return ry;
	}
	public double getwidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y; 
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setRX(double rx)
	{
		this.rx = rx;
	}
	public void setRY(double ry)
	{
		this.ry = ry;
	}
	
	@Override
	public Element newInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean load(String expr) {
		if(expr.contains(" x=")) {
			final Double result = SVGParser.extractDouble(expr, " x=");
			if(result != null) {
				x = result.doubleValue();
			}
		}
		if(expr.contains(" y=")) {
			final Double resultTwo = SVGParser.extractDouble(expr, " y=");
			if(resultTwo != null) {
				y = resultTwo.doubleValue();
			}
		}
		if(expr.contains(" rx=")) {
			final Double resultThree = SVGParser.extractDouble(expr, " rx=");
			if(resultThree != null) {
				rx = resultThree.doubleValue();
			}
		}
		if(expr.contains(" ry=")) {
			final Double resultFour = SVGParser.extractDouble(expr, " ry=");
			if(resultFour != null) {
				ry = resultFour.doubleValue();
			}
		}
		if(expr.contains(" width=")) {
			final Double resultFive = SVGParser.extractDouble(expr, " width=");
			if(resultFive != null) {
				width = resultFive.doubleValue();
			}
		}
		if(expr.contains(" height=")) {
			final Double resultSix = SVGParser.extractDouble(expr, " height=");
			if(resultSix != null) {
				height = resultSix.doubleValue();
			}
		}
		return false;
	}
	
	
}
