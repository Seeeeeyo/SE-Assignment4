package svg.shape;

import svg.element.Element;

public class PathOp extends Shape{
	private final String label;
	private boolean absolute;
	
	//constructor
	public PathOp(final String label) {
		this.label = new String(label);
	}
	
	public void setAbsolute(boolean abs) {
		absolute = abs;
	}
	
	public boolean getAbsolute() {
		return absolute;
	}
	
	public Element newInstance() {
		//to be implemented
		return null;
	}

	public boolean load(String expr) {
		// to be implemented
		return false;
	}
	
	

}
