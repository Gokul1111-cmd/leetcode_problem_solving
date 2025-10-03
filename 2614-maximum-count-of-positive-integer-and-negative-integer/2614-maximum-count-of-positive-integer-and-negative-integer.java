class Solution {
    public int maximumCount(int[] nums) {
        int size = nums.length;
        int pos = 0;
        int neg = 0;
        int max = 0;
        for(int i = 0 ; i < size ; i++){
            if(nums[i] < 0){
                neg++;
            }
            if(nums[i] > 0){
                pos++;
            }
        }
        return Math.max(neg,pos);
    }
}