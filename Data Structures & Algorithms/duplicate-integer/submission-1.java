class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.putIfAbsent(nums[i], 1) != null) return true;
        }
        return false;
    }
}