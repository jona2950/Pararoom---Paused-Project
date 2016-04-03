/**
 * 
 */
package perdiarom.shape.trigonometry;

/**
 * @author jonathanfachola
 * This class is to be inherited by Calculation class
 * This will connect the calculation controller to solve for missing values 
 * in oblique, and right angle triangle
 * with trigonometry rules to solve the missing sides and angles
 */
public class Trigonometry {
	
	//Nova's main guard is defending the values from out populated war
	Value Nova;

	/**
	 * This constructor connects two outputs, for reading, and storing values, and a controller - calculator
	 */
	public Trigonometry() {
		Nova = new Value();
	}
	
	//runs Pythagorean Theorem calculation thru Value
	public double[] PythagoreanNova(double sideA, double sideB, double sideC) {

		return Nova.PythagoreanNova(sideA, sideB, sideC);
	}
	
	//methods to repeat calculating missing values provided
	//check, confirm, and repeat or redo
	

}
