package method_overloading_demo;

class Demo{

}

public class OverloadDemo {
	public static void main(String[] args) {
		int n = 10;
		String s = "a";
		Object o = new Object();
		Demo d = new Demo();

		System.out.println(n); // argument de tip primitiv (int in cazul asta)
		System.out.println(s); // argument de tip String
		System.out.println(o); // argument de tip Object
		System.out.println(d); // argument de tip Demo
		System.out.println();
	}
}
