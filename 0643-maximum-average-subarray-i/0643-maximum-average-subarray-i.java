class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum = 0;
        double win = 0;
        for(int i = 0 ; i < k ; i++){
            win = win + nums[i];
        }
        maxsum = win;
        for(int i = k ; i < nums.length ; i++){
            win = win + nums[i];
            win = win - nums[i -k];
            maxsum = Math.max(win,maxsum);
        }
        return maxsum / k;
    }
}