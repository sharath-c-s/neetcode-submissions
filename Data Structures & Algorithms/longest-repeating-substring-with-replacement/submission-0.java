class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, result = 0, max = 0;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'A']++;
            max = Math.max(max, freq[c - 'A']);
            if((i - left + 1) - max > k) {
                freq[s.charAt(left) - 'A'] --;
                left++;
            }
            result = Math.max(result, (i - left + 1));
        }
        return result;
    }
}
