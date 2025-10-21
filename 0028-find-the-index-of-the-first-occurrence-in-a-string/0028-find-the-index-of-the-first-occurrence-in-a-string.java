class Solution {
    public int strStr(String haystack, String needle) {
        int size = needle.length();
        char d = needle.charAt(0);
        if(size == haystack.length()){
            if(haystack.equals(needle)){
                return 0;
            }
        }
        if(haystack.length() < size){
            return -1;
        }
        for(int i = 0 ; i <= haystack.length() - size ; i++){
            if(haystack.charAt(i) == d){
                    if(needle.equals(haystack.substring(i, i + size))){
                        return i;
                    
                    }
            }
        }
        return -1;
    }
}