import java.util.*;

class selectionSort{
	public static void main(String[] args){
		int arr[] = {42, 17, 89, 3, 65, 28, 74, 11, 53, 6};
		for(int j =0;j<arr.length-1;j++){
			int min = j;
			for(int i =j+1;i<arr.length;i++){
				if(arr[i]<arr[min]){
					min = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[min];
			arr[min] = temp;
			
		}
		
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
	
	