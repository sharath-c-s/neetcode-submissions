class Solution {
    public void sortColors(int[] nums) {
        int[] counter = new int[3];
        for (int i = 0; i < nums.length; i ++) counter[nums[i]] ++;
        System.out.println(Arrays.toString(counter));
        for (int i = 0, j = counter[0], k = counter[0] + counter[1];
             i < counter[0] || j < counter[0] + counter[1] || k < nums.length;
             i++, j++, k++) {
            if (i < counter[0]) nums[i] = 0;
            if (j < counter[0] + counter[1]) nums[j] = 1;
            if (k < nums.length) nums[k] = 2;
        }        
    }
}