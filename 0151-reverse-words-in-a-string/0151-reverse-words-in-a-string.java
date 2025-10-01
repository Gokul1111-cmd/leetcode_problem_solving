class Solution {
    public String reverseWords(String s) {
        int size = s.length();
        String[] words = s.trim().split("\\s+");
        int l = 0;
        int r = words.length - 1;
        while(l < r){
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            b.append(words[i]);
            if(i < words.length - 1){
                b.append(" ");
            }
        }
        return b.toString();
    }
}