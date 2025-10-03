class Solution {
    public int minimumDeletions(int[] nums) {
        int size = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        if(size == 1){
            return 1;
        }
        for(int i = 0 ; i < size ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        int L = Math.min(minIndex, maxIndex);
        int R = Math.max(maxIndex, minIndex);

        int l = R + 1;
        int r = size - L;
        int hy = (L + 1) + (size - R);
        int minb = Math.min(l, Math.min(r,hy));
        return minb;
    }
}