class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int maxlen = 0;
        int left = 0;
        HashSet<Character> h = new HashSet<>();
        for(int i = 0 ; i < size ; i++){
            char t = s.charAt(i);
            while(h.contains(t)){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(t);
            maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }
}