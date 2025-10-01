class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        if(word.length() == 1){
            return true;
        } 
        for(int i = 0 ; i < word.length() ; i++){
            if(Character.isUpperCase(word.charAt(i))){
                cap = cap + 1;
            }
        }
        if(cap == word.length()){
            return true;
        }
        if(cap == 0){
            return true;
        }
        if(cap == 1){
            if(Character.isUpperCase(word.charAt(0))){
                return true;
            }
        }
        return false;
    }
}