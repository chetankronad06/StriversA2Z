import java.util.*;
/*
class isPrime{
	private static boolean isPrime(int n){
		int count  =0;
		for(int i=1;i<=n;i++){
				if(n%i==0){
					count ++;
				}
		}
		return count == 2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long startTime = System.nanoTime();
		System.out.println(isPrime(n)?"prime":"Not prime");
		long endTime = System.nanoTime();
		long time = endTime -  startTime	;
		System.out.print("Tme taken:" + time /100000000.0+ "sec");
	}
}
*/

class isPrime{
	private static boolean isPrime(int n){
		int count  =0;
		for(int i=1;i<=Math.sqrt(n);i++){
				if(n%i==0){
					if(n/i!=i){
						count++;
					}
					count ++;
				}
		}
		return count == 2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long startTime = System.nanoTime();
		System.out.println(isPrime(n)?"prime":"Not prime");
		long endTime = System.nanoTime();
		long time = endTime -  startTime	;
		System.out.print("Tme taken:" + time /100000000.0+ "sec");
	}
}
