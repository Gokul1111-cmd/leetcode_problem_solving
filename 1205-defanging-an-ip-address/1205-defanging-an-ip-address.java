class Solution {
    public String defangIPaddr(String address) {
        StringBuilder b = new StringBuilder();
        for(char c : address.toCharArray()){
            if(c == 46){
                b.append("[.]");
            }
            else{
                b.append(c);
            }
        }
        return b.toString();
    }
}