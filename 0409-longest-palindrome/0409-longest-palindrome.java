class Solution {
    public int longestPalindrome(String s) {
        int size = s.length();
        if(size == 1){
            return 1;
        }
        int[] count = new int[128];
        for(int i = 0 ; i < size ; i++){
            count[s.charAt(i)]++;
        }
        boolean haso = false;
        int len = 0;
        for(int i = 0 ; i < count.length ; i++){
            len = len + (count[i] / 2) * 2;
            if(count[i] % 2 != 0){
                haso = true;
            }
        }
        if(haso){
            len = len + 1;
        }
        return len;
    }
}