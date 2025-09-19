class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ac = (n * (n + 1) / 2);
        int sum = 0;
        for(int ele : nums){
            sum = sum + ele;
        }
        int mis = ac - sum;
        return mis;
    }
}