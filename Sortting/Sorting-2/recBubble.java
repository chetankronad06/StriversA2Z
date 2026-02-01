import java.util.*;
/*
class recBubble{
	public static void recBubbleSort(int[] arr, int size){
		if(size==1)return;
		int i=0;
		while(i<size-1){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
			}
			i++;
		}
		recBubbleSort(arr,size-1);
	}
	public static void main(String[] args){
		int arr[] = {13,46,24,52,20,9};
		recBubbleSort(arr,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
*/


class recBubble{
	public static void recBubbleSort(int[] arr, int size,int j){
		System.out.println( j + "th recursive call" );
		int flag = 0;
		if(size==1)return;
		int i=0;
		while(i<size-1){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
				flag =1;
			}
			i++;
		}
		if(flag==0)return;
		recBubbleSort(arr,size-1,j+1);
	}
	public static void main(String[] args){
		int arr[] = {13,46,24,52,20,9};
		int arr1[] = {9,13,20,24,46,52};
		recBubbleSort(arr1,arr.length,1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}