
public class Circle extends Shape{
	private double cx;
	private double cy;
	private double r;
	
	public Circle(double cx,double cy,double r)
	{
		this.cx = cx;
		this.cy = cy;
		this.r = r;
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
	public void setRX(double cx)
	
	{
	this.cx = cx;
	}
	public void setRY(double cy)
	{
		this.cy = cy;
	}
	public void setR(double radius)
	{
		r = radius;
	}
	

}
