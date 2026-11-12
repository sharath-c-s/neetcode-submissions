class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0; int left = 0; int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            System.out.println(i + " " + sum + " " + left + " " + result);
            sum+= nums[i];
            while (sum >= target) {
                sum -= nums[left];
                result = Math.min(result, i - left + 1);
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;  
    }
}