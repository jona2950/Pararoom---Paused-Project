/**
 * 
 */
package perdiarom.shape.trigonometry;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

/**
 * @author jonathanfachola
 *class operates under the mathematical formula of pythagorean's theorem
 *this is exclusively to calculate missing sides with pythagorean's theorem
 */
public class PythagoreanTheorem extends Calculation {

	
	/**
	 * 
	 */
	public PythagoreanTheorem() {
		// TODO Auto-generated constructor stub
	}
	
	public PythagoreanTheorem(double sideA, double sideB, double sideC) {
		// TODO Auto-generated constructor stub
		super(sideA, sideB, sideC);
		this.boolSideA = setSideA(sideA);
		this.boolSideB = setSideB(sideB);
		this.boolSideC = setSideC(sideC);

	}
	
	public PythagoreanTheorem(double sideX, double sideY, Pattern side) {
		// TODO Auto-generated constructor stub
	}
	
	//global variables for Label: Value Methods
	private double 
	sideA,
	sideB,
	sideC;
	
	
	@SuppressWarnings("unused")
	private boolean 
	boolSideA,
	boolSideB,
	boolSideC;
	
	
	
	//Label: Value Methods
	/* To retrieve or change a private, and global variable
	 * to be inherited by other class files
	 */
	// SIDE //A//
	public double getSideA() {
		return sideA;
	}
	private boolean setSideA(double sideA) {
		this.sideA = sideA;
		return (sideA != 0)? true : false;
	}
	// SIDE //B//
	public double getSideB() {
		return sideB;
	}
	private boolean setSideB(double sideB) {
		this.sideB = sideB;
		return (sideB != 0)? true : false;
	}
	// SIDE //C//
	public double getSideC() {
		return sideC;
	}
	private boolean setSideC(double sideC) {
		this.sideC = sideC;
		return (sideC != 0)? true : false;
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
				setSideA(Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideB, 2)));
				sideA = getSideA();
				
				result = sideA;
				
			}
			else if (sideC != 0 && sideA != 0 && sideB == 0)
			{
				//Finding missing side, a is equal to; c^2 - b^2, then square rooted for c result
				setSideB(Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2)));
				sideB = getSideB();
				result = sideB;
				
			}
			else if (sideA != 0 && sideB != 0 && sideC == 0)
			{
				//Finding missing side, b is equal to; c^2 - a^2, then square rooted for c result
				setSideC(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
				sideC = getSideC();
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
	
	//confirm certaincy missing value was resolved
	protected boolean checkForValueBoolean()
	{
	
		return false;
	}
	

}
