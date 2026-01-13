import java.util.*;
class reversedigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reversedNum =0;
		while(n>0){
			int lastDigit = n%10;
			reversedNum = reversedNum*10 + lastDigit;
			n/=10;
		}
		System.out.print(reversedNum);
	}

}