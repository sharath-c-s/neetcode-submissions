class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Freq = new int[26];

        int s1Len = s1.length();
        for(int i = 0; i < s1Len; i++) s1Freq[s1.charAt(i) - 'a']++;
        String s1FreqStr = Arrays.toString(s1Freq);
        for(int l = 0, r = s1Len; r <= s2.length(); l++,r++) {
            int[] s2SubFreq = new int[26];
            for(int i = l; i < r; i++) s2SubFreq[s2.charAt(i) - 'a']++;
            if (s1FreqStr.equals(Arrays.toString(s2SubFreq))) {
                return true;
            }
        }
        return false;


        
    }
}
