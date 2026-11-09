class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int l = 0, r = numbers.length - 1; l < r;) {
            if (numbers[l] + numbers[r] == target) return new int[]{l+1, r+1};
            if (numbers[l] + numbers[r] < target) {l ++ ; continue;};
            if (numbers[l] + numbers[r] > target) {r -- ; continue;};
        }
        return new int[]{-1, -1};
    }
}
