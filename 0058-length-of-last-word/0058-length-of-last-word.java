class Solution {
    public int lengthOfLastWord(String s) {
        String[] st = s.trim().split("\\s+");
        String res = st[st.length - 1];
        return res.length();  
    }
}