package expressions_and_instructions_demo;

public class DoWhileDemo {
	public static void main(String[] args) {
		int[] arr = {5,2,7,9,1};

		int i = 0;

		do{
			System.out.print(arr[i] + " ");
			i++;
		} while(i > 10);

		System.out.println("Asta se va afisa tot timpul");
	}
}
