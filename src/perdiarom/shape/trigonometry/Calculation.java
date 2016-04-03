/**
 * 
 */
package perdiarom.shape.trigonometry;

import java.util.regex.Pattern;

import perdiarom.shape.trigonometry.Triangle.TriangleProperty;

/**
 * @author jonathanfachola
 * specifies what to calculate next, with what. 
 */
public abstract class Calculation extends Value  {
	

	private Triangle solve;

	private double 
	sideA,
	sideB,
	sideC;

	//checking values being missed
	private boolean 
	boolSideA,
	boolSideB,
	boolSideC;
	
	/**
	 * 
	 */
	public Calculation() {
		
		// TODO Auto-generated constructor stub
	}

	public Calculation(double sideA, double sideB, double sideC) 
	{
		super(sideA, sideB, sideC);
		//assign sides with their values
		this.boolSideA = setSideA(sideA);
		this.boolSideB = setSideB(sideB);
		this.boolSideC = setSideC(sideC);
	}
	
	
	//Label: Value Methods
	/* To retrieve or change a private, and global variable
	 * to be inherited by other class files
	 */
	// SIDE //A//
	public double getSideA() {
		return sideA;
	}
	@SuppressWarnings("unused")
	private boolean setSideA(double sideA) {
		this.sideA = sideA;
		return (sideA != 0)? true : false;
	}
	// SIDE //B//
	public double getSideB() {
		return sideB;
	}
	@SuppressWarnings("unused")
	private boolean setSideB(double sideB) {
		this.sideB = sideB;
		return (sideB != 0)? true : false;
	}
	// SIDE //C//
	public double getSideC() {
		return sideC;
	}
	@SuppressWarnings("unused")
	private boolean setSideC(double sideC) {
		this.sideC = sideC;
		return (sideC != 0)? true : false;
	}
	

//	//plead for a friend 
//	//run commands for performing pythagorean theorem
//	public double PythagoreanNova (double sideA, double sideB, double sideC)
//	{
//		
//		return 0;
//	}

	//return missing value as a to dwerfed double
	public double[] toDoubleDwarf() {
		// TODO Auto-generated method stub
		//check which value was calculated by calling check
		return null;
	}
	
	/**
	 * surfs thru the properties
	 */
	protected void TrigonometriccModel()
	{
		
	}
	/**
	 * calls the formula that can resolve the issue
	 * @return return the formula to be used next
	 */
	protected Triangle solutionProcess()
	{
		//only looking for sides? have two side arguments? let's choose pythagorean
		
		
		return solve;
	}
	
	/**
	 * check for side or angle that needs to be solved with enum SolveFor
	 * @return return the angle or side to be solved for
	 */
	protected TriangleProperty nextSolve()
	{
		
		return solve.getMissingProperty();
	}
	protected boolean searchValues()
	{
		
		return false;
	}


}
