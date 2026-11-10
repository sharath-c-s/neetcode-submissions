class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0,1);
        for (int num: nums) {
            sum += num;
            count += freq.getOrDefault(sum - k, 0);
            freq.merge(sum, 1, Integer::sum) ; 
        }
        return count;

        
    }
}