
public class QuickSort {

	public static void main(String[] args) {
		int [] arr = {6,5,8,2,9,1};
		
		System.out.println("Before Sorting: ");
		printArray(arr);
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("After Sorting");
		printArray(arr);
		
	}
	
	public static void printArray(int [] arr) {
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void quickSort(int []arr, int left, int right) {
		if(left < right) {
			int partitionIndex = partition(arr, left, right);
			quickSort(arr, left, partitionIndex-1);
			quickSort(arr, partitionIndex+1, right);
			
		}
	}
	
	public static int partition(int []arr, int left, int right) {
		int pivot = arr[left];
		int i = left + 1;
		
		for(int j = left + 1; j <= right; j++) {
			if(arr[j]< pivot) {
				//Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;

			}
		}
		
		// Place the pivot in a correct index;
		
		int temp = arr[left];
		arr[left] = arr[i-1];
		arr[i-1] = temp;
		
		return i-1;
	}
}
