class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int l = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(target <= nums[i]){
                l = i;
                break;
            }
            if(i == nums.length - 1){
                return i + 1;
            }
        }
        return l;
    }
}