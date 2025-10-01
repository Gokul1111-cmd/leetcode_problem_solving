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
        int k = 0;
        for(String word : words){
            b.append(word);
            if(k < words.length - 1){
                b.append(" ");
            }
            k++;
        }
        return b.toString();
    }
}