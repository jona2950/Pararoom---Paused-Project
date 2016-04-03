package perdiarom.shape.trigonometry;

import java.util.List;

public class Triangle {

	protected enum TriangleProperty {

		SideA, SideB, SideC, AngleA, AngleB, AngleC

	}

	private double sideA, sideB, sideC;

	private double angleA, angleB, angleC;

	private TriangleProperty missingProperty;

	public List<TriangleProperty> getResolvedProperties() {
		return resolvedProperties;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getAngleA() {
		return angleA;
	}

	public void setAngleA(double angleA) {
		this.angleA = angleA;
	}

	public double getAngleB() {
		return angleB;
	}

	public void setAngleB(double angleB) {
		this.angleB = angleB;
	}

	public double getAngleC() {
		return angleC;
	}

	public void setAngleC(double angleC) {
		this.angleC = angleC;
	}

	public TriangleProperty getMissingProperty() {
		return missingProperty;
	}

	public void setMissingProperty(TriangleProperty missingProperty) {
		this.missingProperty = missingProperty;
	}

	public void setResolvedProperties(List<TriangleProperty> resolvedProperties) {
		this.resolvedProperties = resolvedProperties;
	}

	private List<TriangleProperty> resolvedProperties;



}
