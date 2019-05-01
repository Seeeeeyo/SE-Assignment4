
public class Ellispe {
	public double cx;
	public double cy;
	public double rx;
	public double ry;
	public Ellispe()
	{
		super("Ellipse");
	}
	
	public void setcx(double cx)
	{
		this.cx = cx;
	}
	public void setcy(double cy)
	{
		this.cy = cy; 
	}

	public void setrx(double rx)
	{
		this.rx = rx;
	}
	public void setry(double ry)
	{
		this.ry = ry; 
	}
	public double getcx()
	{
		return cx;
	}
	public double getcy()
	{
		return cy;
	}
	public double getrx()
	{
		return rx;
	}
	public double getry()
	{
		return ry;
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
		return false;
	}

}
