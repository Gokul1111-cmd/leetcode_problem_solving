class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int size = nums.length;
        long curr = 0;
        long max = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0 ; i < k ; i++){
            curr = curr + nums[i];
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        if(h.size() == k){
            max = curr;
        }
        for(int i = k ; i < size; i++){
            int cu = nums[ i - k ]; 
            curr = curr - cu;

            h.put(cu , h.get(cu) - 1);
            if(h.get(cu) == 0){
                h.remove(cu);
            }

            int si = nums[i];
            curr = curr + si;

            h.put(si, h.getOrDefault(si, 0) + 1);
            if(h.size() == k){
                max = Math.max(max, curr); 
            }
        }
        return max;
    }
}