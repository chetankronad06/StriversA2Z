import java.util.*;
class pattern18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1,k=n;i<=n&&k>0;i++,k--){
			for(int j =0,counter=64+k;j<i;j++){
				System.out.print((char)counter++);
			}
			System.out.println();
		}

	}

}