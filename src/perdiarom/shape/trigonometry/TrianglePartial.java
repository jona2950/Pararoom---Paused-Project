package perdiarom.shape.trigonometry;

import java.util.ArrayList;
import java.util.List;

public class TrianglePartial {

	//class holds the parts of a triangle, one side and corresponding angle at ..a time
	
	private final static int UNKNOWN = 0;
	
	//
	public enum Side {
		a, b, c
	}
	/**
	 * Angle and Side must be the same when storing a partial
	 * @author jonathanfachola
	 *
	 */
	public enum Angle {
		A, B, C
	}
	//
	
	public enum AngleType {
		NOASSIGNMENT (-1, -1), 	//binary -1 - for off state - do not assign
		UNASSIGNED  (0, 0), 	//binary 0 - for missing state
		ACUTE 		(0, 90), 	//an angle that is less than 90°
		RIGHT 		(90, 90), 	//an angle that is 90° exactly
		OBUTUSE 	(90, 180), 	//an angle that is greater than 90° but less than 180°
		STRAIGHT 	(180, 180), //an angle that is 180° exactly
		REFLEX 		(180, 360); //an angle that is greater than 180°
		
		private final int lessThan; //Less than
		private final int greaterThan; 
		
		AngleType(int lessThan, int greaterThan) {
			this.lessThan = lessThan;
			this.greaterThan = greaterThan;
		}
		
		public int lessThan() { return lessThan; }
		public int greaterThan() { return greaterThan; }
		
	}
	
	private Side side;
	private float sideLength;
	
	private Angle angle;
	
	private AngleType angleType;
	private float angleDegree;
	
	TrianglePartial(Side sideArg, float sideLengthArg, 
			Angle angleArg, AngleType angleTypeArg,
			float angleDegreeArg){
		this.side = sideArg;
		this.sideLength = sideLengthArg;
		this.angle = angleArg;
		this.angleType = angleTypeArg;
		this.angleDegree = angleDegreeArg;
	}

	/**
	 * get methods
	 * @return the value of a variable associated to its name
	 */
	public Side getSide() {
		return side;
	}

	public float getSideLength() {
		return sideLength;
	}


	public Angle getAngle() {
		return angle;
	}

	public AngleType getAngleType() {
		return angleType;
	}


	public float getAngleDegree() {
		return angleDegree;
	}
	
	public void printPartial(){
		System.out.printf("Side:%s%nLength:%s%nAngle:%s%nType:%s%nDegrees:%s%n", 
				getSide().name(), getSideLength(), getAngle().name(), getAngleType().name(), getAngleDegree());
	}

	/**
	 * Creates the element roster, provided the arguments passed are sides of one triangle,  
	 * and than split into 3 sections of a natural triangle properties
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static List<TrianglePartial> createTriangleElements(float a, float b, float c) {
		//create new triangle partials with passed elements
		List<TrianglePartial> elements = new ArrayList<>();
		elements.add(
			new TrianglePartial(
				Side.a, 				//this needs to be determined by the variable passing the side a //redundant
				a, 						//the side value of a
				Angle.A,				//Angle name should be determined by the side being passed, such as a is to A, b is to B, etc.
				AngleType.UNASSIGNED, 	//AngleType needs to be determined by angleDegree
				UNKNOWN 				//since this method does not allow to pass arguments of angles, we need to substitute the variables locally. 
			));
		elements.add(
			new TrianglePartial(
				Side.b,
				b,
				Angle.B,
				AngleType.UNASSIGNED,
				UNKNOWN
			));
		elements.add(
			new TrianglePartial(
				Side.c,
				c,
				Angle.C,
				AngleType.RIGHT,
				UNKNOWN
			));
		return elements;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((angle == null) ? 0 : angle.hashCode());
		result = prime * result + Float.floatToIntBits(angleDegree);
		result = prime * result + ((angleType == null) ? 0 : angleType.hashCode());
		result = prime * result + ((side == null) ? 0 : side.hashCode());
		result = prime * result + Float.floatToIntBits(sideLength);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TrianglePartial other = (TrianglePartial) obj;
		if (angle != other.angle) {
			return false;
		}
		if (Float.floatToIntBits(angleDegree) != Float.floatToIntBits(other.angleDegree)) {
			return false;
		}
		if (angleType != other.angleType) {
			return false;
		}
		if (side != other.side) {
			return false;
		}
		if (Float.floatToIntBits(sideLength) != Float.floatToIntBits(other.sideLength)) {
			return false;
		}
		return true;
	}

}
