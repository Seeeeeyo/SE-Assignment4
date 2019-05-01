package svg.shape;

import svg.SVGParser;
import svg.element.Element;

public class PathOp extends Shape{
	private boolean absolute;
	private char label;
	
	//constructor
	public PathOp() {
		super("path");
		
	}
	
	public void setAbsolute(boolean abs) {
		absolute = abs;
	}
	
	public boolean getAbsolute() {
		return absolute;
	}
	
	public void setLabel(final char label) {
		this.label = label;
	}
	
	public char getLabel() {
		return label;
	}
	
	public Element newInstance() {
		return new PathOp();
	}

	public boolean load(final String expr) {
		return false;
	} 
	
	

}
