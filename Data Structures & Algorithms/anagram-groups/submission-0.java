class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str: strs) {
            int[] key = new int[26];
            for (int i = 0; i < str.length(); i++) key[str.charAt(i) - 'a'] ++;
            String hash = Arrays.toString(key);
            if (groups.containsKey(hash)) groups.get(hash).add(str);
            else {
                groups.put(hash, new ArrayList<String>());
                groups.get(hash).add(str);
            }
        }
        return new ArrayList<>(groups.values());
        
    }
}
