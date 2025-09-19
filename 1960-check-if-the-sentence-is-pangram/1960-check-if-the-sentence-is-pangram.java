class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] b = new boolean[26];
        int size = sentence.length();
        char[] arr = sentence.trim().toCharArray();
        int count = 0;
        for(char c : arr){
            int index =  c - 'a';
            if(!b[index]){
                b[index] = true;
                count++;
            }
        }
        return count == 26;
        
    }
}