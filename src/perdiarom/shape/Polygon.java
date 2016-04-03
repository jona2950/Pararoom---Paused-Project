package perdiarom.shape;

public class Polygon extends Shape {
	//Instance variables
	private double
		width,
		height,
		diagonalLength,
		area, 
		perimeter;
	
	private short maximumAngleDegree;
	
	private double[][] coordinatePoints = new double[4][2];
	
	/**
	 * 
	 * @param numOfShape
	 * @param shapeId
	 * @param objectId
	 * @param contourDimension
	 */
	public Polygon(int numOfShape, String shapeId, String objectId,
			int contourDimension) {
		super(numOfShape, shapeId, objectId, contourDimension);

	}
	
	private boolean calculateForAllAngles()
	{
		
		return false;
	}

	@Override
	public String toString() 
	{
		
		return String.format("null"); //the string displays the basic detail of the shape inheritance from this class.
	}

	
	protected void setDiagonalLength(double diagonalLength)
	{
		this.diagonalLength = diagonalLength;
	} //Need, "getDiagonalLength"

	
	
	private boolean validatePerimeterValue(double unit)
	{
		if (unit < 0)
			return true;
		
		return false;
	}
	
	protected void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;

	}
	 
	public void setArea(double area) {
		this.area = area;
	} // Need, "getArea"
		
	
	
	
	@Override
	protected String ShapeInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
