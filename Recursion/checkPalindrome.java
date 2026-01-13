import java.util.*;

class checkPalindrome{
	private static boolean checkPalindrome( String str){
		char [] arr = str.toCharArray();
		int i =0;
		int j = arr.length-1;
		while(i<j){
			if(arr[i]!=arr[j])return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str  = "ABCDCBA";
		System.out.print(checkPalindrome(str) ? "Palindrome" : "Not Palindrome");
		
	}
}