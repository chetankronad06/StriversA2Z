import java.util.*;
class pattern15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =n;i>0;i--){
			for(int j =1,counter = 65;j<=i;j++){
				System.out.print((char)counter++);
			}
			System.out.println();
		}

	}

}