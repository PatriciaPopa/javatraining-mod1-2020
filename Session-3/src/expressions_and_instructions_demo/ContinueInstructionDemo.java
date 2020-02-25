package expressions_and_instructions_demo;

public class ContinueInstructionDemo {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}

			System.out.println(i);

			// echivalent cu a scrie:
			//			if(i % 2 != 0) {
			//				System.out.println(i);;
			//			}
		}
	}
}
