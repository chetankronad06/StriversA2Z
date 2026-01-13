import java.util.*;
class pattern17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =n,k=1,a=-1;i>0&&k<=n&&a<n;i--,k++,a++){
			for(int j =1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j =1,counter =65;j<=k;j++,counter++){
				System.out.print((char)counter);
			}
			for(int j =2,counter =65+a;j<=k;j++,counter--){
				System.out.print((char)counter);
			}
			System.out.println();
		}

	}

}