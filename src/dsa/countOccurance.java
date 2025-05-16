package dsa;

public class countOccurance {

	public static void main(String[] args) {

		//		Input:
		//			arr = {1, 2, 3, 2, 4, 2, 5}
		//			target = 2
		//
		//			Output:
		//			3
		
		int [] arr = {1,2,3,4,5,2,2,2};
		int target = 2;
		int count = 0;
		
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] == target) {
				count++;
			}	
		}
		System.out.println(count);

	}
}
