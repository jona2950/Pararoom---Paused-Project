package perdiarom.shape;

import java.util.ArrayList;


public abstract class Shape {
	//Instance variables
	private int numOfShape;
	private String 
		shapeId,
		objectId;
	//private ShapeList shapeType;
	
	private int contourDimension ; 
	
	private int 
		symmetryLines, 		
		vertices, 
		edges,
		planes;
	

	private ArrayList<Double> sideLengths = new ArrayList<>();
	
	private ArrayList<String> anglesType = new ArrayList<>();
	private ArrayList<Short> angles = new ArrayList<>(); //Depending on dimensions, is how many angles to be filled
	
	//This can be reduced
	
	public interface Payable {
		
		//public static final
		int X = 5;
		//no instance variables can be declared


	}
	public static enum angleType
	{

		FIND
		{
			@Override
			public String AngleObservation(short a) {
				if (a > 90)
					return "ACUTE";
				else if (a == RIGHT_ANGLE_DEGREEE)
					return "RIGHT";
				else if (a < RIGHT_ANGLE_DEGREEE && a > STRAIGHT_ANGLE_DEGREE)
					return "OBTUSE";
				else if (a == STRAIGHT_ANGLE_DEGREE)
					return "STRAIGHT";
				else if (a < STRAIGHT_ANGLE_DEGREE && a > FULL_ROTATION_ANGLE_DEGREE)
					return "REFLEX";
				else
					return null;
			}
		};
		private String type;
		//Constants
		public static final short 
				RIGHT_ANGLE_DEGREEE 	= 90,	
				STRAIGHT_ANGLE_DEGREE 	= 180,
				FULL_ROTATION_ANGLE_DEGREE = 360;
		
		public abstract String AngleObservation(short a);
	}
	
	/**
	 * 
	 * @param numOfShape
	 * @param shapeId
	 * @param objectId
	 * @param area2 
	 * @param perimeter2 
	 * @param shapeType
	 * @param dimensions
	 * @param perimeter
	 * @param area
	 */
	public Shape(int numOfShape, String shapeId, String objectId,
			int contourDimension) {
		super();
		this.numOfShape = numOfShape;
		this.shapeId = shapeId;
		this.objectId = objectId;
		this.contourDimension = contourDimension;

	}
	
	private boolean countSymmetryLines()
	{
		symmetryLines = ((vertices/2)+vertices)/2;
		
		return false;
	}
	
	
	@Override
	public String toString() 
	{
		
		return String.format("null"); //the string displays the basic detail of the shape inheritance from this class.
	}
	
	protected abstract String ShapeInformation();
}
