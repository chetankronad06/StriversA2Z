import java.util.*;
class allDivisors{
	private static List<Integer> getAlldivisors(int n){
		List<Integer> list = new ArrayList<>();
		for(int i =1;i*i<=n;i++){
			if(n%i==0){
				list.add(i);
				if(i!=n/i){
					list.add(n/i);
				}
			}
		}
		return list;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(getAlldivisors(n));	
	}
}
