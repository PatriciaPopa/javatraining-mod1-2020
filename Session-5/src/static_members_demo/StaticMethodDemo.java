package static_members_demo;

public class StaticMethodDemo {
	public static void main(String[] args) {
		faCeva();
	}

	public static void faCeva() {
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.main(null);
	}
}
