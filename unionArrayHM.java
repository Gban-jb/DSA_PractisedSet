package array2;
import java.util.*;
public class unionArrayHM {
	public static void main(String[] args) {
		
		//1. Create a set.
		//2. Store the element in a set
		//3. Print the size of the set and the element.
		
		HashSet<Integer> set = new HashSet<>();
		
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {4,5,6,7,8};
		
		for(int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for(int j = 0; j < arr2.length; j++) {
			set.add(arr2[j]);
		}
		System.out.println(set.size());
		System.out.print(set);
		
	}

}
