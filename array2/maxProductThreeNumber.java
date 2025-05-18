package array2;
public class maxProductThreeNumber {

	public static void main(String[] args) {
		int [] arr = {1,4,3,2,5};
		//List <Integer> sort = new ArrayList<>();				
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
					// Swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
			}
		//   sort.add(arr[i]);
			}
		// System.out.println(sort);
		// Print the sorted array (optional)
        System.out.print("Sorted array (ascending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
		
//      Sorted element.
//		Collections.reverse(sort);
//		System.out.println(sort);
		
		//int maxproduct = sort.get(sort.size()-1) * sort.get(sort.size()-2)* sort.get(sort.size()-3);
		int maxproduct = arr[arr.length-1] * arr[arr.length-2]* arr[arr.length-3];
		System.out.println(maxproduct);
	}
}