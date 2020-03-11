package pasarea_parametrilor_la_metode_demo;

public class PasareaParametrilorDeTipReferinta {
	public static void main(String[] args) {
		String str = "Hello";

		tryToReassignString(str);

		System.out.println(str);
	}

	public static void tryToReassignString(String str) {
		str = "World";
	}
}
