package expressions_and_instructions_demo;

public class ForDemo2 {
	public static void main(String[] args) {
		int[] arr = {5,2,7,9,1};

		// varianta 1
		//		for(int i=0; i<arr.length; i++) {
		//			if(arr[i] % 2 == 0) {
		//				System.out.print(arr[i] + " ");
		//			}
		//		}

		// varianta 2
		for(int currElement : arr) {
			if(currElement % 2 == 0) {
				System.out.print(currElement + " ");
			}
		}
	}
}
