/*🔸 Input Example:
Initial array (fixed size 10, current size 5):
arr = [10, 20, 30, 40, 50, _, _, _, _, _]

Insert: value = 25 at index = 2  
Delete: element at index = 4
🔸 Expected Output:
After insertion:
[10, 20, 25, 30, 40, 50, _, _, _, _]
After deletion (removing 50 at index 4):
[10, 20, 25, 30, 40, _, _, _, _, _]

🔹 Constraints:
Insertion only allowed if size < capacity

Index should be within 0 and current size

Deletion only allowed if array is not empty

Use only manual shifting, no built-in array functions

 */


package dsa;

public class insertDeleteArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int size = 5; // current number of valid elements
		int capacity = arr.length;

		System.out.print("Before insertion: [");
		for (int i = 0; i < capacity; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

		// INSERT
		int index = 2;
		int value = 25;

		if (index <= size && size < capacity) {
			for (int i = size; i > index; i--) {
				arr[i] = arr[i - 1];
			}
			arr[index] = value;
			size++;
		}

		System.out.print("After insertion: [");
		for (int i = 0; i < capacity; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

		// DELETE
		int deleteIndex = 4;
		System.out.println("To delete value at index 4 (expected: 40).");

		if (deleteIndex < size) {
			for (int i = deleteIndex; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[size - 1] = 0; // Optional cleanup
			size--;
		}

		System.out.print("After deletion: [");
		for (int i = 0; i < capacity; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
}
