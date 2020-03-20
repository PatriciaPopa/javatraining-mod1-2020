package enum_demo;

public enum MathConstants {
	PI(3.14), GOLDEN_RATIO(1.61);

	private final double value;

	MathConstants(double value){
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
