class Solution {
    public int binarySearch(int low, int high, int[] nums, int t){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(nums[mid] == t){
            return mid;
        }
        if(nums[mid] < t){
            return binarySearch(mid + 1, high, nums, t);
        }
        else{
            return binarySearch(low, mid - 1, nums, t);
        }
    }
    public int search(int[] nums, int target) {
        int res = binarySearch(0,nums.length - 1 , nums, target);
        return res;
    }
}