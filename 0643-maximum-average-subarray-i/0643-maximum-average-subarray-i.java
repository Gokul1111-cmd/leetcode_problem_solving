class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum = 0;
        for(int i = 0 ; i < k ; i++){
            maxsum = maxsum + nums[i];
        }
        double wi = maxsum;
        for(int i = k ; i < nums.length ; i++){
            maxsum = maxsum + nums[i];
            maxsum = maxsum - nums[i - k];
            wi= Math.max(maxsum, wi);
        }
        return wi / k;
    }
}