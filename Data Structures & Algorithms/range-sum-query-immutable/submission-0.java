class NumArray {

    List<Integer> prefix = new ArrayList<Integer>();

    public NumArray(int[] nums) {
        prefix.add(0);
        for (int i = 0; i < nums.length; i ++) prefix.add(prefix.get(i) + nums[i]);
    }
    
    public int sumRange(int left, int right) {
        return prefix.get(right + 1) - prefix.get(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */