class Solution {
    public int maxArea(int[] heights) {
        int result = Integer.MIN_VALUE;
        for(int l = 0, r = heights.length -1; l < r;){
            result = Math.max(Math.min(heights[l], heights[r]) * (r - l), result);
            if (heights[l] < heights[r]) l++;
            else r--;
        }
        return result;

        
    }
}
