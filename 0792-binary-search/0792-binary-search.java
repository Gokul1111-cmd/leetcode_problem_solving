class Solution {
    public int binarySearch(int low, int high, int target, int[] arr){
        if(low > high){
            return -1;
        }
        int mid = ( low + high ) / 2;
        if(arr[mid] == target){
            return mid;
        }
        
        if(arr[mid] < target){
            return binarySearch(mid + 1,high, target,arr);
        }
        else{
            return binarySearch(low, mid - 1, target, arr);
        }

    }
    public int search(int[] nums, int target) {
        int res = binarySearch(0,nums.length - 1,target, nums);
        return res;
    }
}