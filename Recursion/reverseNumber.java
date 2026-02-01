import java.util.*;
class reverseNumber{
	public static int reverse(int n){
		int temp=0;
		return reverseHelper(n,temp);
	}
	
	public static int reverseHelper(int n , int temp){
		if(n==0){
			return 0;
		}
		int rem = n%10;
		n/=10;
		temp= temp*10+ rem ;
		return reverseHelper(n,temp);
	}
	public static void main(String[] args){
		System.out.print(reverse(54321));
	}
}

