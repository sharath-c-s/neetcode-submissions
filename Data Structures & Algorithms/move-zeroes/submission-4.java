class Solution {
    public void moveZeroes(int[] nums) {
        int w = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != w) {
                    int t = nums[i];
                    nums[i] = nums[w];
                    nums[w] = t;
                }
                w++;
            }
        }
    }
}