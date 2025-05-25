package dsa_java;
public class ReverseArray {
	//{1,2,3,4,5} given
	// {5,4,3,2,1}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int left = 0;
		int right = arr.length-1;

			while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++; right--;
		}	

		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}