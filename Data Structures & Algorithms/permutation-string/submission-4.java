// We want to return true or false if a permutation exists in s2
// since we finding the substring in s2, they must be the same length


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] oneArr = new int[26];
        int[] secondArr = new int[26];

        int l = 0;
        int matches = 0;

        for (int i = 0; i < s1.length(); i++) {
            oneArr[s1.charAt(i) - 'a']++;
            secondArr[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (oneArr[i] == secondArr[i]) {
                matches++;
            }
        }

        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) return true;

            int index = s2.charAt(r) - 'a';
            secondArr[index]++;
            if (oneArr[index] == secondArr[index]) {
                matches++;
            } else if (oneArr[index] + 1 == secondArr[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            secondArr[index]--;
            if (oneArr[index] == secondArr[index]) {
                matches++;
            } else if (oneArr[index] - 1 == secondArr[index]) {
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
}
