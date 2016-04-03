package perdiarom.shape.trigonometry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;

/**
 * Class for Trigonometry
 * 
 * Defining Pythagorean theorem
 */

public class TrigonometryFunction {
	
	double
		angleA,
		angleB,
		angleC;
	
	double 
		sideA,
		sideB,
		sideC;

	
	public TrigonometryFunction()
	{
		//Initiating angle variables
		angleA = 0;
		angleB = 0;
		angleC = 0;
		//Initiating side variables
		sideA = 0;//adjacent
		sideB = 0; 
		sideC = 0; 
	}
	public TrigonometryFunction(double sideA, double sideB)
	{
		setSideA(sideA);
		setSideB(sideB);
	}	
	public TrigonometryFunction(double angleA, double angleB, double sideA, double sideB)
	{
		setAngleA(angleA);
		setAngleB(angleB);
		
		setSideA(sideA);
		setSideB(sideB);
	}	
	public TrigonometryFunction(double angleA, double angleB, double angleC, double sideA, double sideB, double sideC)
	{
		setAngleA(angleA);
		setAngleB(angleB);
		setAngleC(angleC);
		
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
	}
	
	/**
	 * Methods below are getters and setters for angels and sides
	 * @param new values associated to set's name
	 * @return value returned of getters
	 */
	public double getAngleA() {
		return angleA;
	}
	private void setAngleA(double angleA) {
		this.angleA = angleA;
	}

	public double getAngleB() {
		return angleB;
	}
	private void setAngleB(double angleB) {
		this.angleB = angleB;
	}
	
	public double getAngleC() {
		return angleC;
	}
	private void setAngleC(double angleC) {
		this.angleC = angleC;
	}
	
	public double getSideA() {
		return sideA;
	}
	private void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	private void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
	private void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	//Methods below are used to set and get value
	private double forAngleA(double angleA) {
		this.angleA = angleA;
		return angleA;
	}
	private double forAngleB(double angleB) {
		this.angleB = angleB;
		return angleB;
	}
	private double forAngleC(double angleC) {
		this.angleC = angleC;
		return angleC;
	}
	private double forSideA(double sideA) {
		this.sideA = sideA;
		return sideA;
	}
	private double forSideB(double sideB) {
		this.sideB = sideB;
		return sideB;
	}
	private double forSideC(double sideC) {
		this.sideC = sideC;
		return sideC;
	}
	
	
	/**
	 * To calculate missing side with Pythagorean Theorem formula
	 * calculates for missing side (sideX = 0), while given the other two side lengths
	 * @param sideA value passed for side a
	 * @param sideB value passed for side b
	 * @param sideC value passed for side c
	 * @return result of calculated missing side
	 */
	public double pythagoreanTheorem(double sideA, double sideB, double sideC)
	{
		//local variables
		double result = 0;
		
		//Formula for finding missing side 
		//...listed below
		
		try {
		//Finding which side is empty, for that side to be calculated
			if (sideC != 0 && sideB != 0 && sideA == 0)
			{
				//Finding missing side, c (hypotenuse) is equal to; a^2 + b^2, then square rooted for c result
				sideA = forSideA(Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideB, 2)));
				result = sideA;
				
			}
			else if (sideC != 0 && sideA != 0 && sideB == 0)
			{
				//Finding missing side, a is equal to; c^2 - b^2, then square rooted for c result
				sideB = forSideB(Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2)));
				result = sideB;
				
			}
			else if (sideA != 0 && sideB != 0 && sideC == 0)
			{
				//Finding missing side, b is equal to; c^2 - a^2, then square rooted for c result
				sideC = forSideC(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
				result = sideC;
	
			}
			else
				throw new IllegalArgumentException("no values passed for calculating Pythagorean Therorem");
		}
	    catch(InputMismatchException ime)
	    {
	        System.out.println("Mismatching Input. Input need be a Numerical value");
	    }
		catch (Exception e)
		{
			throw new IllegalArgumentException("unacceptable value passed\nNumerical value needed; " + e.getMessage());
		}

		
		//suggest for finding side with missing two others?
		
			setSideA(sideA);
			setSideB(sideB);
			setSideC(sideC);
		
			return result;
	}
	
	
	//redo
	/**
	 * Method is used to calculate missing sides or angles 
	 * same as the acronym SohCahToa to guide students to use 
	 * the proper functions associated to the given sides/angles
	 * @param opposite 
	 * @param adjacent
	 * @param hypotenuse
	 * @return the end-result of the missing side/angle calculation 
	 */
	public double trigonometricRatios(double adjacent_a, double opposite_b, double hypotenuse_c, double angleA, double angleB)
	{ 
		
		//local variables
		double result = 0;
		BigDecimal polygonValue;
		
		
		//Find better approach to solve-before some if-structures
		try 
		{
			if (adjacent_a != 0 || opposite_b != 0 || hypotenuse_c !=0)
			//maybe remove boolean, hyperbolic
			if (angleA != 0 || angleB != 0)
			{
				//have a quickFeature?
				
				//if looking for adjacent_a, check for necessary variable to complete calc
					//sin
						//hypotenuse_c & angleB
					//cos
						//hypotenuse_c & angleA
					//tan
						//opposite_b & angleB
				
				//if looking for opposite_b, check for necessary variable to complete calc
					//sin
						//hypotenuse_c & angleA
					//cos
						//hypotenuse_c & angleB
					//tan
						//adjacent_a & angleA
				
				//if looking for hypotenuse_c, check for necessary variable to complete calc
					//sin
						//opposite_b & angleA
						//adjacent_a & angleB
				
				
				/* conclusion; all angles must be present to figure out if side is to be calculated
				 * Adjecent and missing opposite_b sides can share the same function for calculating sides. 
				 * What will determine is the missing calculation is missing side.
				 * From what's empty/missing
				 */
				
				if (adjacent_a == 0)
				{
					//variables local to if-structure
					boolean calcPerformed = false;
					
					if (hypotenuse_c != 0)
					{
						if (angleB != 0)//sin
						{
							adjacent_a = (hypotenuse_c * Math.sin(angleB * Math.PI / 180));
							calcPerformed = true;
							
						}
						else if (angleA != 0) //cos
						{
							adjacent_a = (hypotenuse_c * Math.cos(angleA * Math.PI / 180));
							calcPerformed = true;
		
						}
					}
					else if (opposite_b != 0)//tan
					{
						adjacent_a = (opposite_b / Math.tan(angleB * Math.PI / 180));
						calcPerformed = true;
						
					}
					
					//if calculation was performed, round the number and save to adjacent_a
					if (calcPerformed){
						polygonValue = new BigDecimal(adjacent_a);
						polygonValue = polygonValue.setScale(4, RoundingMode.HALF_UP);
						
						adjacent_a = polygonValue.doubleValue();
						result = adjacent_a;
	
					}
				}
				
				if (opposite_b == 0)
				{
					//variables local to if-structure
					boolean calcPerformed = false;
					
					if (hypotenuse_c != 0)
					{
						if (angleB != 0)//sin
						{
							opposite_b = (hypotenuse_c * Math.sin(angleB * Math.PI / 180));
							calcPerformed = true;
							
						}
						else if (angleA != 0) //cos
						{
							opposite_b = (hypotenuse_c * Math.cos(angleA * Math.PI / 180));
							calcPerformed = true;
							
						}
					}
					else if (adjacent_a != 0)//tan
					{
						opposite_b = (adjacent_a / Math.tan(angleA * Math.PI / 180));
						calcPerformed = true;
						
					}
	
					//if calculation was performed, round the number and save to adjacent_a
					if (calcPerformed){
						polygonValue = new BigDecimal(opposite_b);
						polygonValue = polygonValue.setScale(4, RoundingMode.HALF_UP);
						
						opposite_b = polygonValue.doubleValue();
						result = opposite_b;
						
						
					}
				}
				
				if (hypotenuse_c == 0)
				{
					//variables local to if-structure
					boolean calcPerformed = false;
					
					if (adjacent_a != 0 && angleA != 0)
					{
						hypotenuse_c = (adjacent_a / Math.sin(angleA * Math.PI / 180));
						calcPerformed = true;
						
					}
					else if (opposite_b != 0 && angleB != 0)//tan
					{
						hypotenuse_c = (opposite_b / Math.sin(angleB * Math.PI / 180));
						calcPerformed = true;
		
					}
					//if not calculated, calculate missing angles and/or sides
	
					//if calculation was performed, round the number and save to adjacent_a
					if (calcPerformed){
						polygonValue = new BigDecimal(hypotenuse_c);
						polygonValue = polygonValue.setScale(4, RoundingMode.HALF_UP);
						
						hypotenuse_c = polygonValue.doubleValue();
						result = hypotenuse_c;
						
					}
				}
	
				
			}
			
			
			
			//Find which to use A, or B. As well, if one angle is provided the other can be calculated like so
			// angle-180= x_angle
			
			if (result == 0){ //Maybe boolean?
				
				boolean calcPerformed = false;

				if (opposite_b != 0 && hypotenuse_c != 0)
				{
					//check of which two options are available for calculating side
					result = Math.toDegrees(Math.asin(opposite_b/hypotenuse_c));
					calcPerformed = true;
					
				}
				else if (adjacent_a != 0 && hypotenuse_c != 0)
				{
					result = Math.toDegrees(Math.acos(adjacent_a/hypotenuse_c));
					calcPerformed = true;
					
				}
				else if (opposite_b != 0  && adjacent_a != 0)
				{
					result = Math.toDegrees(Math.atan(opposite_b/adjacent_a));
					calcPerformed = true;
					
				}
				
				
				if (calcPerformed){
					
					polygonValue = new BigDecimal(result);
					polygonValue = polygonValue.setScale(4, RoundingMode.HALF_UP);
					
					if (angleA != 0)
					{
						setAngleB(polygonValue.doubleValue());
					}
					else if (angleB != 0)
					{
						setAngleA(polygonValue.doubleValue());
					}

				}

			}
			
		}
	    catch(InputMismatchException ime)
	    {
			throw new IllegalArgumentException("Mismatching input type. Numerical value is only accepted.");
			
	    }
		catch (Exception e)
		{
			throw new IllegalArgumentException(e.getMessage());
		}
		
		
		setSideA(adjacent_a);
		setSideB(opposite_b);
		setSideC(hypotenuse_c);

		return result;	
	}

	/**
	 * Such as trigonometicRatios, this instead automatically finds all missing values 
	 * this function is not flexible, thus it would be used explicitly for displaying values of 90o triangle
	 * @param adjacent_a 
	 * @param opposite_b
	 * @param hypotenuse_c
	 * @param angleA
	 * @param angleB
	 * @return false if returned uncompleted or failed, true when method ran through series of finding missing values
	 */
	public boolean trigonometricRatios_AUTO(double adjacent_a, double opposite_b, double hypotenuse_c, double angleA, double angleB)
	{
		//area to find what is missing, and determine which value will be spewed by order of if structure
		//fix trig so it can use two values
		//match values saved for each variable to returned value
		//change method to specify sideA, SideB, etc. 
		
		/**first thing method above does it solve for sides. opposite_b, adjacent_a, hypotenuse_c.
		 * 		trigonometricRatios(4.6, 0, 0, 33, 0) with values passed, 
		 * 	I can find hypotenuse_c, after I can find for angleA, after I can find adjacent_a side. 
		 *	application will look for side adjacent_a before angleA
		 */
		//argument variables to method assigners to insure full calculation is done without being missed
		setSideA(adjacent_a);
		setSideB(opposite_b);
		setSideC(hypotenuse_c);
		
		setAngleA(angleA);
		setAngleB(angleB);
		
		//temp var for testing
		int i = 0;
		
		if ((checkForSides() || checkForAngles())){
			
			do {	
				trigonometricRatios(getSideA(), getSideB(), getSideC(), getAngleA(), getAngleB());
				displayValues();	
				
			} while((checkForSides() || checkForAngles()));
			
			return true;
		}
		else {
			displayValues();
			
			throw new IllegalArgumentException("UNKNOWN COMPLETION%n");
		}
		//should throw an error instead of continuing, "COMPLETE UNKNOWN"

	}
	
	/**
	 * Such as trigonometicRatios, this instead automatically finds all missing values
	 * @param adjacent_a 
	 * @param opposite_b
	 * @param hypotenuse_c
	 * @param angleA
	 * @param angleB
	 * @return false if returned uncompleted or failed, true when method ran through series of finding missing values
	 */
	public boolean trigonometricRatios_AUTOf(double adjacent_a, double opposite_b, double hypotenuse_c, float angleA, float angleB, float angleC)
	{
		//area to find what is missing, and determine which value will be spewed by order of if structure
		//fix trig so it can use two values
		//match values saved for each variable to returned value
		//change method to specify sideA, SideB, etc. 
		
		/**first thing method above does it solve for sides. opposite_b, adjacent_a, hypotenuse_c.
		 * 		trigonometricRatios(4.6, 0, 0, 33, 0) with values passed, 
		 * 	I can find hypotenuse_c, after I can find for angleA, after I can find adjacent_a side. 
		 *	application will look for side adjacent_a before angleA
		 */
		//argument variables to method assigners to insure full calculation is done without being missed
		setSideA(adjacent_a);
		setSideB(opposite_b);
		setSideC(hypotenuse_c);
		
		setAngleA(angleA);
		setAngleB(angleB);
		setAngleC(angleC);
		
		//temp var for testing
		int i = 0;
		
		if ((checkForSides() || checkForAngles())){
			
			do {	
				trigonometricRatios(getSideA(), getSideB(), getSideC(), getAngleA(), getAngleB());
				displayValues();	
				
			} while((checkForSides() || checkForAngles()));
			
			return true;
		}
		else {
			displayValues();
			
			throw new IllegalArgumentException("UNKNOWN COMPLETION%n");
		}
		//should throw an error instead of continuing, "COMPLETE UNKNOWN"

	}
	
	private void displayValues()
	{		
		
		System.out.printf("%n%nPresent Values-----%n-Sides--------%n a: %s%n b: %s%n c: %s%n-Angels--------%n A: %s%n B: %s%n C: %s",
				getSideA(), getSideB(), getSideC(), getAngleA(), getAngleB(), getAngleC());
		
	}
	
	/**
	 * Method is used to check if any values are missing for side(s), a, b or c
	 * @return false if value(s) are present
	 */
	//equip with a feature to "disclude" a certain value being returned
	private boolean checkForSides()
	{
		
		if (getSideA() == 0)
		{
			return true;
		}
		if (getSideB() == 0)
		{
			return true;
		}
		if (getSideC() == 0)
		{
			return true;
		}

		
		return false;
		
	}
	
	/**
	 * Method is used to check if any values are missing for angles(s), A, B or C
	 * @return false if value(s) are present
	 */
	private boolean checkForAngles()
	{
		
		//angles
		if (getAngleA() == 0)
		{
			return true;
		}
		if (getAngleB() == 0)
		{
			return true;
		}
//		if (getAngleC() == 0)
//		{
//			return true;
//		}
		
		return false;
	}
	
	public double theSineLaw(double sideA, double sinA, double sideB, double sinB, double sinC, double sideC)
	{
		
		//local variables
		double result = 0; 
		
			forSideA((sideB * sinC)/(sinB * sideC));
			forAngleA((sinB * sideC)/(sideB * sinC));
			
			forSideB((sideA * sinC)/(sinA * sideC));
			forAngleB((sinA * sideC)/(sideA * sinC));
			
			forSideC((sideA * sinB)/(sinA * sideB));
			forAngleC((sinA * sideB)/(sideA * sinB));
			
		return 0;
	}
	
	public double theCosineLaw(double sideA, double cosA, 
								double sideB, double cosB, 
								double cosC, double sideC)
	{
			
		forSideA(((Math.pow(sideC,2)-Math.pow(sideB, 2))-2*(sideC)*(sideB)*Math.cos(cosA)));
		

		forSideB((Math.pow(sideC, 2)-Math.pow(sideA, 2))-2*(sideC)*(sideB)*Math.cos(cosB));
		
		forSideC((Math.pow(sideA,2)+(Math.pow(sideB, 2))-2*(sideA)*(sideB)*Math.cos(cosC)));
		
		return 0;
	}
}
