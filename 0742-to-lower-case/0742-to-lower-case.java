class Solution {
    public String toLowerCase(String s) {
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            c = Character.toLowerCase(c); 
            b.append(c);
        }
        return b.toString();
    }
}