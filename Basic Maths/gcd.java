import java.util.*;
/*
class gcd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd = 1;
		for(int i =1;i<=n1;i++){
			if(n1%i==0  && n2 %i==0){
				if(i>gcd ){
					gcd =i;
				}
			}
		}
		System.out.print("gcd is :" + gcd);
	}
}

*/

/*
class gcd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd = 1;
		for(int i =Math.min(n1,n2);i>0;i--){
			if(n1%i==0  && n2 %i==0){
				if(i>gcd ){
					gcd =i;
				}
			}
		}
		System.out.print("gcd is :" + gcd);
	}
}
*/

class gcd{
	public static int findGcd(int n1,int n2){
		while(n1>0 && n2>0){
			if(n1>n2){
				n1 = n1%n2;
			}
			else{
				n2 = n2%n1;
			}
		}
		if(n1==0) return n2;
		return n1;
		
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd = 1;
		System.out.print(findGcd(n1,n2));
	}
}

