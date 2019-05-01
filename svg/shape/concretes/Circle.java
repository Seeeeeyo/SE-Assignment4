package svg.shape.concretes;
import svg.element.Element;
import svg.element.Shape.Shape;

public class Circle extends Shape{
	private double cx;
	private double cy;
	private double r;
	
	public Circle()
	{
		super("circle");
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
		// TODO Auto-generated method stub
		return false;
	}

}
