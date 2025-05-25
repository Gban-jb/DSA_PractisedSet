package dsa;

public class isPalindrome {
	public static void main(String[] args) {
		int [] arr = {1,2,3,2,1};
		boolean ispalindrome = true;

		int start = 0;
		int end = arr.length-1;

		while(start < end) {
			if(arr[start] == arr[end]) {
				ispalindrome = true;
			}
			else {
				ispalindrome = false;
				break;
			}
			end--;
			start++;
		}

		String message = (ispalindrome) ? "The array is palindrome.": "The array is not palindrome.";
		System.out.println(message);
	}
}
