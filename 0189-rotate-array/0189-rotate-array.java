class Solution {
    private void rot(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        if(k == 0 || size == 0){
            return ;
        }
        
        rot(nums, 0, size - 1);
        rot(nums, 0, k - 1);
        rot(nums, k , size - 1);
    }
}