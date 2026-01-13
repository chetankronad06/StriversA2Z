import java.util.*;

class fibonacci{
	private static int getFibonacci(int n ,int first, int second ,List<Integer> list){
		
		if(n==1 || n==0){
			return 0;
		}
		if(n==2){
			return 1;
		}
		int res =  getFibonacci(n-1,first,second,list) + getFibonacci(n-2,first,second,list);
		list.add(res);
		return 1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		getFibonacci(n,first,second,list);
		System.out.print(list);
		
	}
}