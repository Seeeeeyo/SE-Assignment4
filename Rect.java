
public class Rect extends Shape{
	private double x;
	private double y;
	private double rx;
	private double ry;
	private double width;
	private double height;
	public Rect(double x,double y,double rx,double ry,double width,double height)
	{
		this.rx = rx;
		this.ry = ry;
		this.x =x;
		this.y = y;
		this.width = width;
		this.height = height;
		
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
	
	/**public static void main(String[] args)
	{
		rect Rectangle = new rect(10.0,10.0,0.0,0.0,30.0,30.0);
		
	}*/
	
}
