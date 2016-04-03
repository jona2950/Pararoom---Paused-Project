package perdiarom.shape;

import perdiarom.shape.trigonometry.TrigonometryFunction;

/**
 * 4 sides only
 * @author Jonathan
 *
 */


public class Quadrilaterals extends Polygon {
	
	public Quadrilaterals(int numOfShape, String shapeId, String objectId,
			int contourDimension) {
		super(numOfShape, shapeId, objectId, contourDimension);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This is the template of a rectangle, 
	 * taking height and length for calculating area, parameter, etc. 
	 * @param height
	 * @param length
	 */
	public void rectangle(double width, double height)
	{
		//Formula for finding area
		super.setArea(width+height);
		//Formula for rectangle perimeter
		super.setPerimeter((width*2)+(height*2));
		//Formula to calculate diagonal inside of a rectangle/square
		super.setDiagonalLength(Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
		
		TrigonometryFunction t = new TrigonometryFunction();
	}

}
