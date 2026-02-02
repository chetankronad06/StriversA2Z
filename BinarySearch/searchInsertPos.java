/*
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (i < nums.length - 1 && target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int target = 2;
        int nums[] = {1, 3, 5, 6};
        System.out.println(sol.searchInsert(nums, target));
    }
}
*/

class searchInsertPos{
    public static int searchInsertPosition(int[] nums, int target) {
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
	
	public static void main(String[] args){
		int arr[] = {1,3,5,6};
		System.out.print(searchInsertPosition(arr,7));
	}
}