class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, result = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= left) left = map.get(c) + 1;
            map.put(c, i);
            result = Math.max(result, i - left + 1);
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}
