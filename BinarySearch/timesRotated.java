import java.util.*;

/*
class timesRotated{
	public static int timesrotated(int [] arr){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				return i+1;
			}
		}
		return-1;
	}
	public static void main(String[] args){
		int arr[] = {3,4,5,1,2};
		int times = timesrotated(arr);
		System.out.print(times);
	}
}

*/

class timesRotated{
	public static int timesrotated(int [] arr){
		int low =0;
		int high = arr.length-1;
		while(low<high){
			int mid = (low+high)/2;
			if(arr[mid]>arr[high]){
				low = mid+1;
			}
			else{
				high = mid;
			}
		}
		return low;
	}
	public static void main(String[] args){
		int arr[] = {4,5,6,7,0,1,2,3};
		int times = timesrotated(arr);
		System.out.print(times);
	}
}