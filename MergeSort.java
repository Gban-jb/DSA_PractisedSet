public class MergeSort {
	public static void main(String[] args) {
		int [] numbers = {3,1,2,4,1,5,2,6,4};
		// Step 1: Mergesort Function and print function
		System.out.println("Before Sorting: ");
		printArray(numbers);
		
		// MergeSort function
		mergeSort(numbers, 0, numbers.length-1);
		
		System.out.println("After Sorting");
		printArray(numbers);
	}
	
	public static void printArray(int[] arr) {
		for(int value: arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int []arr, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			// merge
			merge(arr, left, mid, right);
		}
	}
	public static void merge(int []arr, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int [] leftArray = new int[n1];
		int [] rightArray = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
		}
		for(int j = 0; j < n2; j++) {
			rightArray[j] = arr[mid+j+1];
		}
		
		//compare and add in the original array
		
		int i=0, j=0, k=left;
		
		while(i < n1 && j < n2) {
			if (leftArray[i]<=rightArray[j]) {
			arr[k] = leftArray[i];
			i++;
		}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
			while(i<n1) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}
			while(j<n2) {
				arr[k] = rightArray[j];
				j++;
				k++;
			}
		}
		
	}

