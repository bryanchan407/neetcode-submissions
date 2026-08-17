class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int m = left + ((right - left) / 2);
            if (nums[m] > target) {
                right = m;
            } else {
                left = m + 1;
            }
        }
        return (left > 0 && nums[left - 1] == target) ? left - 1: -1;
    }
}
