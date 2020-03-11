package static_members_demo;

public class SimplifiedCar {
	private String color;
	public static int counter;

	public SimplifiedCar(String color) {
		this.color = color;
		counter++;
	}

	//	public void setColor(String color) {
	//		this.color = color;
	//		counter++;
	//	}

}