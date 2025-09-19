class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> s = new HashSet<>();
        for(char c : sentence.toCharArray())  s.add(c);
        return s.size() == 26;
    }
}