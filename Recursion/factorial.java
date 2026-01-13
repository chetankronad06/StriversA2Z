import java.util.*;

class factorial{
	private static int getFact(int n){
		if(n==1 || n==0){
			return 1;
		}
		return n * getFact(n-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(getFact(n));
		
	}
}