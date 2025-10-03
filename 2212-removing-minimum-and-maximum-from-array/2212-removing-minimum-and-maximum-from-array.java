class Solution {
    public int minimumDeletions(int[] nums) {
        int size = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int maxi= Integer.MIN_VALUE;
        if(size == 1){
            return 1;
        }
        for(int i = 0 ; i < size  ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxi = i;
            }
            if(nums[i] < min){
                min = nums[i];
                mini = i;
            }
        }
        int L = 0;
        int R = 0;
        L = Math.min(mini,maxi);
        R = Math.max(mini,maxi);
        int l = R + 1;
        int r = size - L;
        int hy = (L + 1) + (size - R);
        int mi = Math.min(l, Math.min(r, hy));
        return mi;
    }
}