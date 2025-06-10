package array2;
import java.util.HashMap;

public class airplaneConnectivityHM {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		String start = "";
		map.put("Pokhara", "Butwal");
		map.put("Butwal", "Jhapa");
		map.put("Jhapa", "Nepalgunj");
		map.put("Nepalgunj", "Mustang");
		map.put("Kathmandu", "Pokhara");
		
		HashMap<String, String> revMap = new HashMap<>();
		
		
		for(String key: map.keySet()) {
			revMap.put(map.get(key), key);
		}
		
		//1. Find start - a. Reverse the HashMap  		b. And find the element where there is only in from but not in to.
		
		for(String key: map.keySet()) {
			if(!revMap.containsKey(key)) {
				start = key;
				System.out.println(start);	  //Start
			}
		}
		
		while(map.containsKey(start)) {
			System.out.print(start + " -> ");
			start = map.get(start);
		}
		
		System.out.println(start);
		
	}
}