class Solution {
    public boolean isPalindrome(String s) {
        int size = s.length();
        if(s == null || s.isEmpty() || size == 0){
            return true;
        }
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < size ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                b.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder res = new StringBuilder(b).reverse();
        if(res.toString().equals(b.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}