import java.util.*;
class pattern9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =n,k=1;i>0;i-- , k++){
			for(int j =1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j =1;j<=2*k-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =n,k=0;i>0&&k<n;i-- , k++){
			for(int j =1;j<=k;j++){
				System.out.print(" ");
			}
			for(int j =1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}