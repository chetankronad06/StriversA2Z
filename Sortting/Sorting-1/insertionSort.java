import java.util.*;

class insertionSort{
	public static void main(String[] args){
		int arr[] = {23, 1, 10, 5, 2};
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0;i<arr.length;i++){
			int curr = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]> curr){
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] = curr;
			
		}
		
		
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}