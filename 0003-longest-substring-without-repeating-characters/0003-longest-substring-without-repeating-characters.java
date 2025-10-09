class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int left = 0;
        int max = 0;
        int i = 0;
        HashSet<Character> h = new HashSet<>();
        for(i = 0 ; i < size; i++){
            char c = s.charAt(i);
            while(h.contains(c)){
                char t = s.charAt(left);
                h.remove(t);
                left++;
            }
            h.add(c);
            max = Math.max(max, i - left + 1);
        }
        
        return max;
    }
}