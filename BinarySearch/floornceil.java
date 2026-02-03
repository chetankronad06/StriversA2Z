 class floornceil{
    public static int[] floornceilVal(int[] nums, int target) {
		int lb = lowerBound(nums,target);
		int up = upperBound(nums,target);
        return new int[]{lb,up};
    }
	
	public static int lowerBound(int[] nums, int target){
		int low=0;
        int high = nums.length-1;
		int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
				ans = mid;
				high = mid-1;
			}
            else{
                low = mid+1;
            }
        }
        return ans;
	}
	
	public static int upperBound(int[] nums, int target){
		int low=0;
        int high = nums.length-1;
		int ans = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] > target){
				ans = mid;
				high = mid-1;
			}
            else{
                low = mid+1;
            }
        }
        return ans;
	}
	
	public static void main(String[] args){
		int arr[] = {5,7,7,8,8,10};
		int ans[]=floornceilVal(arr,8);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+ " ");
		}
	}
}