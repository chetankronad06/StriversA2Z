import java.util.*;
class pattern12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1,k=n;i<=n && k>0;i++,k--){
			for(int j =1;j<=i;j++){
				System.out.print(j);
			}
			for(int j =0 ; j<2*k-2;j++){
				System.out.print(" ");
			}
			for(int j =i;j>0;j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}