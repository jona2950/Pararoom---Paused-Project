package perdiarom.shape.trigonometry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Tells which operation formula needs running to the calculation class
 * @author jonathanfachola
 *
 */

public class Value extends Trigonometry {
	

	//private instance retaining the property
	Triangle blackhole;

	
	//Super vises the out going routes of small population
	List<Calculation> DwarfRoster;
	
	public Value() {
		//figure out the calculation method
	}
	/**
	 * class constructor allows for instant solution to be piped
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 */
	public Value(double sideA, double sideB, double sideC) {
		//DwarfRoster = new ArrayList<Calculation>();

		setProperty(sideA, sideB, sideC);
		//after setting the property of our triangle we need to iterate thru the side values
		
		blackhole = getProperty();
		
		//figure out the calculation method
		//this is instantly pytheogrean, or finding angles
		
		//		DwarfRoster.add(new PythagoreanTheorem(sideA, sideB, sideC));
	}
	
	//while setting properties to our triangle, check for missing values
	public Triangle setProperty (double sideA, double sideB, double sideC)
	{
		blackhole.setSideA(sideA);
		blackhole.setSideB(sideB);
		blackhole.setSideC(sideC);
		return blackhole;
	}

	public static Triangle lookup (List<Triangle> roster, Predicate<Triangle> block) 
	{
		for(Triangle t : roster)
		{
			if (block.test(t)) {
				
			}
		}
 
		return null;
	}
	
	/**
	 * view of properties
	 *@return property side or angle, or name or more
	 */
	public Triangle getProperty ()
	{
		
		return blackhole;
	}
	
	
	

	//check for value
	protected Pattern checkPatternValue ()
	{
		return null;
		
	}
	//numerically check for value
	protected float checkFloatValue ()
	{
		
		return 0;
	}

}


////run commands for performing pythagorean theorem
//public double[] PythagoreanNova (double sideA, double sideB, double sideC)
//{
//	Calculation Dwarfd;
//	Dwarfd = DwarfPyth =
//	
//	return Dwarfd.toDoubleDwarf();
//}
//