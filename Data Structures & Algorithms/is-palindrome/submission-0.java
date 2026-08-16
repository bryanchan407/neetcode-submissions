class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int first = 0;
        int last = newStr.length() - 1;

        while (first < last) {
            if (newStr.charAt(first) != newStr.charAt(last)) return false;
            first++;
            last--;
        }
        return true;
    }
}
