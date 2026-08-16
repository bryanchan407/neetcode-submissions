class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();

        hm.put('}', '{');
        hm.put(']', '[');
        hm.put(')', '(');

        if (s.length() % 2 == 1) return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stk.push(c);
            } else {
                if (stk.isEmpty()) return false;
                char n = stk.pop();
                if (hm.get(c) != n) return false;
            }
        }

        if (!stk.isEmpty()) return false;

        return true;
        
    }
}
