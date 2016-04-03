package perdiarom.shape.trigonometry;



public class TriangleCheckMissingSide implements CheckPartial {

	@Override
	public boolean test(TrianglePartial t) {
		return t.getSideLength() == 0;
	}



}
