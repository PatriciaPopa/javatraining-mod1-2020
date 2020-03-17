package string_demo;

public class StringAndSbDemo {
	public static void main(String[] args) {

		// cate referinte si cate obiecte se vor crea pana la linia 10?
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";

		// cate referinte si cate obiecte se vor crea de la linia 12 la linia 14?
		String s4 = "a";
		s4 += "b";
		s4 += "c";

		// cate referinte si cate obiecte se vor crea de la linia 17 la linia 20?
		StringBuilder sb1 = new StringBuilder("a");
		sb1.append(1);
		sb1.append(2);
		sb1.append(3);

		System.out.println(sb1);
	}
}