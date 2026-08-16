class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n : nums) {
            if (!hm.containsKey(n)) {
                hm.put(n, 1);
                continue;
            }
            return true;
        }
        return false;
    }
}