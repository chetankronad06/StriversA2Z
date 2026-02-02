 class upperBound {
    public static int search(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
		int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] > target){
				ans = mid;
				low = mid+1;
			}
            else{
                high = mid-1;
            }
        }
        return ans;
    }
	
	public static void main(String[] args){
		int arr[] = {1,2,2,3};
		System.out.print(search(arr,2));
	}
}