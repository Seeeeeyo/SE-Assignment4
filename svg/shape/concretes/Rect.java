package svg.shape.concretes;

import svg.element.Element;
import svg.element.Shape.Shape;

public class Rect extends Shape{
	private double x;
	private double y;
	private double rx;
	private double ry;
	private double width;
	private double height;
	public Rect()
	{
		super("rectangle");
		
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
		// TODO Auto-generated method stub
		return false;
	}
	
	/**public static void main(String[] args)
	{
		rect Rectangle = new rect(10.0,10.0,0.0,0.0,30.0,30.0);
		
	}*/
	
}
