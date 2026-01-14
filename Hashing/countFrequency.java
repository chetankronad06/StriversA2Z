import java.util.*;

class countFrequency{
	private static void printFrequency(int[] arr){
		boolean visited[] = new boolean[arr.length];
		for(int i =0;i<arr.length;i++){
			if(!visited[i]){
				int num = arr[i];
				int count =0;
				for(int j =0;j<arr.length;j++){
					if(num == arr[j]){
						count ++;
						visited[j] = true;
					}
					
				}
				System.out.println(num + " occurs " + count + " times");
			}
		}
	}
	
	public static void main(String[] args){
		int arr[] = {1,2,2,3,4,3,5,8,8,0};
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		printFrequency(arr);
	}
}