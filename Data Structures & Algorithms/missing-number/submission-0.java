class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1)) / 2;
        System.out.println(sum);
        for (int x: nums) sum -= x;
        return sum;
    }
}
