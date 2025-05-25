<<<<<<< HEAD
package dsa_java;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        boolean isStrictlyIncreasing = true; // First true
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isStrictlyIncreasing = false;
                break; // Break from here
        }
        System.out.println(isStrictlyIncreasing);
    }
}
=======
package dsa;

public class isSorted {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		boolean isStrictlyIncreasing = true; // First true
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				isStrictlyIncreasing = false;
				break; // Break from here
			}
		}
		System.out.println(isStrictlyIncreasing);
	}
}
>>>>>>> fe5aa86 (Added Problem 3 - Find Min and Max in array)
