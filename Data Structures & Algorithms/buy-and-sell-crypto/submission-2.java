class Solution {
    public int maxProfit(int[] nums) {
        int first = 0;
        int last = 1;
        int max = 0;

        while (last < nums.length) {
            if (nums[first] < nums[last]) {
                max = Math.max(nums[last] - nums[first], max);
            } else {
                first = last;
            }
            last++;
        }
        return max;
    }
}
