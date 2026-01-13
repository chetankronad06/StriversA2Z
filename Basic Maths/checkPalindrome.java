import java.util.*;
class checkPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int actualNum = sc.nextInt();
		int copy = actualNum;
		int reversedNum =0;
		while(copy>0){
			int lastDigit = copy%10;
			reversedNum = reversedNum*10 + lastDigit;
			copy/=10;
		}
		if(actualNum==reversedNum){
			System.out.print("Palindrome");
		}else{
			System.out.print("Not Palindrome");

		}
	}

}