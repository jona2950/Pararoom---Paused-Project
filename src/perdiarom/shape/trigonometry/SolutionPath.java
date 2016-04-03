package perdiarom.shape.trigonometry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SolutionPath {
	
	//we need to reference the class which is in the list by looking up its hashcode and comparing its equality
	//hash map
	private int partialHashCode;
	
	private List<TrianglePartial> triangle;

	/**
	 * This class can only be initiated once to manage progress in our list and data sent back
	 * **rule applies too buffer streams**
	 */
	public SolutionPath() {
		triangle = new ArrayList<>();
	}
	
	/**
	 * pass three arguments for sides of the triangle 
	 * **since we're only passing sides, we can agree we're looking for a side**
	 * **if values of sides are known, we might be looking for angles**
	 * @param a side
	 * @param b side 
	 * @param c side
	 */
	public SolutionPath(float a, float b, float c) {
		triangle = setTriangularParameters(a, b, c);
	}
	
	public void test_unknowns(){
		unknowns(
			triangle, new TriangleCheckMissingSide());
	}
	
	/**
	 * checks for unknown values and uses prints method of TriagnelPartial
	 * @param elements
	 * @param partial
	 */
	private void unknowns(
		List<TrianglePartial> elements,
		TriangleCheckMissingSide partial
	){
		for (TrianglePartial t : elements) {
			if (partial.test(t)) {
				partialHashCode = t.hashCode(); 
				t.printPartial();
			}
		}
	
	}
	
	public void getHash(){
		System.out.println(triangle.listIterator().hashCode());
	}

	/**
	 * Places the values into a new triangle parameter with side and angle
	 * **this function can only be trigger once**
	 * @param a pass the value of one side
	 */
	private List<TrianglePartial> setTriangularParameters (float a, float b, float c)
	{
		return triangle = TrianglePartial.createTriangleElements(a, b, c);
	}
}
