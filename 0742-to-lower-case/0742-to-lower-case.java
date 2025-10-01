class Solution {
    public String toLowerCase(String s) {
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
            c = (char)(c + 32);
            }
            b.append(c);
        }
        return b.toString();
    }
}