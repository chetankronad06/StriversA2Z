import java.util.*;
class pattern11{
	private static int flag ;
	private static int toggle(int n){
		if(n==1){
			flag =0;
			return 0;
		}
		flag = 1;
		return 1;

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<=n;i++){
			if(i%2==0){
				flag =1;
				for(int j =0;j<i;j++){
					System.out.print(toggle(flag));
				}
			}else{
				flag =0;
				for(int j =0;j<i;j++){
					System.out.print(toggle(flag));
				}
			}
			System.out.println();
		}

	}

}