import java.util.*;
class armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		int count = (int)(Math.log10(n)+1);
		int sum = 0;
		while(copy>0){
			int lastDigit = copy%10;
			int power = (int) Math.round(Math.pow(lastDigit , count));
			sum += power;
			copy/=10;
		}
		if(n== sum){
			System.out.print("armstrong");
		}
		else{
			System.out.print("Not armstrong");
		}		
	}
}
