import java.util.*;

class mergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[arr.length];
        int left = low, right = mid + 1;
		int k=0;
		
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[right++];
        }
		
        while (left <= mid)
            temp[k++] = arr[left++];

        while (right <= high)
            temp[k++] = arr[right++];
		
        for (int i = low; i <= high; i++)
            arr[i] = temp[i-low];
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;   
		
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
		for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
 
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

}