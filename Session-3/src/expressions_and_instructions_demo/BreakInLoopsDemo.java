package expressions_and_instructions_demo;

public class BreakInLoopsDemo {
	public static void main(String[] args) {
		int currElement = 1;

		do {
			if(currElement == 5) {
				break;
			}

			System.out.println(currElement);

			currElement++;
		}while(currElement <= 10);
	}
}
