package array2;
import java.util.HashSet;

public class intersectionSetHM {
	
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {4,5,6,7,8};
		
		HashSet<Integer> set = new HashSet<>();
		
		int count = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for(int j = 0; j < arr2.length; j++) {
			if(set.contains(arr2[j])) {
				count++;
				System.out.print(arr2[j] + " ");
				set.remove(arr2[j]);
			}
		}
		System.out.println();
		
		System.out.println(count);
		
		
	}

}
