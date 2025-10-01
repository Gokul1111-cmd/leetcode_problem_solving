class Solution {
    public String reverseWords(String s) {
        int size = s.length();
        String[] words = s.trim().split("\\s+");
        StringBuilder b = new StringBuilder();
        for(int i = words.length - 1; i >= 0 ; i--){
            b.append(words[i]);
            if(i != 0){
                b.append(" ");
            }
        }
        return b.toString();
    }
}