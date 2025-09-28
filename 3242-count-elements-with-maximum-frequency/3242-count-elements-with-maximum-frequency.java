class Solution {
    public int maxFrequencyElements(int[] nums) {
        int size = nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0 ; i < size ; i++){
            int ele = nums[i];
                h.put(ele, h.getOrDefault(ele, 0) + 1);
        }
        int maxfreq = 0;
        for(int ele : h.values()){
            maxfreq = Math.max(maxfreq, ele);
        }
        int res = 0;
        for(int ele : h.values()){
            if(maxfreq == ele){
                res = res + maxfreq;
            }
        }
        return res;
    }
}