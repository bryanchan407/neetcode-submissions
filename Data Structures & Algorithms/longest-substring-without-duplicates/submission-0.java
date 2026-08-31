class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                l = Math.max(hm.get(c) + 1, l);
            }
            hm.put(c, i);
            res = Math.max(res, i - l + 1); 
        }
        return res;
    }
}
