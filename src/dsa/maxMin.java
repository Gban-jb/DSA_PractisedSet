package dsa;

public class maxMin {

	public static void main(String[] args) {
		int []arr = {5, 3, 8, 1, 9, 2};
		// int arr[] = {1,2,3,4,5};
		int min = arr[0];
		int max = arr[0];

		// for min
		for(int i=1; i <= arr.length-1; i++) {
			if (min > arr[i]) {	
				min = arr[i];
			}
		}
		System.out.println( "Minimum" + ":" + min);

		//for max
		for(int j=1; j <= arr.length-1; j++) {
			if (max < arr[j]) {	
				max = arr[j];
			}
		}
		System.out.println("Maximum" + ":" + max);
	}
}
