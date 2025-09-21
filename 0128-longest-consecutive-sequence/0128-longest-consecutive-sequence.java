class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        HashSet<Integer> h = new HashSet<>();
        for(int ele : nums){
            h.add(ele);
        }
        int max = 0;
        for(int num : h){
            if(!h.contains(num - 1)){
                 int curr = 1;
                 while(h.contains(num+ 1)){
                    curr = curr + 1;
                    num = num + 1;
                 }
                 max = Math.max(max,curr);
            }
        }
        return max;
    }
}