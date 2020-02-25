package expressions_and_instructions_demo;

public class WhileDemo2 {

	public static void main(String[] args) {
		int[] arr = {5,2,7,9,1};

		int i = 0;

		while(i < arr.length) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}

			i++;
		}

		System.out.println("Asta se executa mereu");
	}

}
