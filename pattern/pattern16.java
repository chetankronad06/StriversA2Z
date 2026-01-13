import java.util.*;
class pattern16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1,counter = 65;i<=n;i++,counter++){
			for(int j =0;j<i;j++){
				System.out.print((char)counter);
			}
			System.out.println();
		}

	}

}