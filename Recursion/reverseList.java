import java.util.*;

class reverseList{
/*
	private static void getReversedArray(List<Integer> arr){
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
*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.print(list);
/*
		int arr[] = {9, 8, 7 ,6 ,5, 3, 2, 1};
		getReversedArray(arr);
		System.out.println("Reversed array is :");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
*/
		
	}
}