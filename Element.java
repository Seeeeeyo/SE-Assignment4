package svg.element;

//-----------------------------------------------------------------------------

/**
 * SVG element type.
 * @author cambolbro
 */
public interface Element
{
	/**
	 * @return Label for this shape.
	 */
	public String label();
	
	/**
	 * @param other
	 * @return Comparison with other element.
	 */
	public int compare(final Element other);
	
	/**
	 * @return New element of own type.
	 */
	public Element newInstance();
	
	/**
	 * Load this shape's data from an SVG expression.
	 * @return Whether expression is in the right foramt and data was loaded.
	 */
	public boolean load(final String expr);
}
