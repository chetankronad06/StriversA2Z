import java.util.*;
class pattern13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0;
		for(int i =1;i<=n;i++){
			for(int j =0;j<i;j++){
				System.out.print(++counter + " ");
			}
			System.out.println();
		}

	}

}