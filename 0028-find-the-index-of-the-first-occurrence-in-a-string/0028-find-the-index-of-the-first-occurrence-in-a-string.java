class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        
        // Handle the edge case where the needle is longer than the haystack.
        if (haystackLength < needleLength) {
            return -1;
        }
        
        // Brute-Force/Sliding Window Approach (O(N*M) worst case)

        // Loop through all possible starting positions in the haystack.
        // CRITICAL FIX: The loop must run up to and INCLUDING the last possible starting index.
        // Last index is: haystackLength - needleLength.
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            
            // Optimization: Quick check of the first character before calling substring (not strictly necessary but common).
            // if (haystack.charAt(i) == needle.charAt(0)) {
                
                // Extract the substring of the haystack of the same length as the needle.
                String currentSubstring = haystack.substring(i, i + needleLength);
                
                // Compare the extracted substring with the needle.
                if (needle.equals(currentSubstring)) {
                    return i; // Match found at starting index i.
                }
            // }
        }
        
        // If the loop finishes without finding a match.
        return -1;
    }
}