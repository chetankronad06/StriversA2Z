import java.util.*;

class reverseArray{
	private static void getReversedArray(int [] arr){
		int i =0;
		int j = arr.length-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {9, 8, 7 ,6 ,5, 3, 2, 1};
		getReversedArray(arr);
		System.out.println("Reversed array is :");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}