package Chapter1;

public class Question1_2 {
	private static void sumArr(int[] arr, int index) {
		if(index < 1) index = 1;
		
		if(index >= arr.length) return;
		
		arr[index] += arr[index-1];
		sumArr(arr, index + 1);
	}
	
	private static void printArr(int[] arr) {
		System.out.print("{");
		
		if(arr.length > 0) System.out.print(arr[0]);
		for(int i=1; i<arr.length; i++) {
			System.out.print(", " + arr[i]);
		}
		
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Original Array:");
		printArr(arr);
		
		sumArr(arr, 1);
		
		System.out.println("After Modification:");
		printArr(arr);
	}
}
