package dsa;

public class majorityElement {

	public static void main(String[] args) {
		int [] arr = {1,3,3,3,2,3,2,2,3};
		int n = arr.length / 2;     // Finding the threshold for majority
		int num;                    // Variable to store current number
		int count = 0;              // Counter to track occurrences
		boolean found = false;      // Boolean flag to track if majority is found

		for(int i = 0; i < arr.length; i++) {
			// Extracting the number
			num = arr[i];
			count = 0;   // Resetting count for each new number

			// Counting the total number of occurrences of the number
			for(int j = 0; j < arr.length; j++) {
				if(num == arr[j]) {
					count++;
				}
			}

			// Checking if the count crosses the required threshold
			if(count >= n) {
				System.out.printf("The number which is majority is %d and it occurs %d times.\n", num, count);
				found = true;
				break;
			}
		}

		// If majority element not found, print this
		if(!found) {
			System.out.println("No majority number");
		}
	}
}
