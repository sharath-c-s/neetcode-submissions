class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        for(; l < r;) {
            int mid = l + (r - l)/2;
            if (nums[mid] < target) {l = mid + 1; continue;}
            if (nums[mid] >= target) {r = mid ; continue;}
        }
        return l;
    }
}