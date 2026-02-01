import java.util.*;

class recInsertion{
	public static void recInsertionSort(int[] arr, int iter){
		if(iter==arr.length)return;
		int curr = arr[iter];
		int j = iter-1;
		while(j>=0 && arr[j]> curr){
			arr[j+1]= arr[j];
			j--;
		}
		arr[j+1] = curr;
		recInsertionSort(arr,iter+1);
	}
	public static void main(String[] args){
		int arr[] = {23, 1, 10, 5, 2};
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		recInsertionSort(arr,0);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

