class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int index = 0;
        for (String c: tokens) {
            if (c.equals("+")) {
                stk.push(stk.pop() + stk.pop());
            } else if (c.equals("-")) {
                int b = stk.pop();
                stk.push(stk.pop() - b);
            } else if (c.equals("*")) {
                stk.push(stk.pop() * stk.pop());
            } else if (c.equals("/")) {
                int b = stk.pop();
                stk.push(stk.pop() / b);
            } else {
                stk.push(Integer.parseInt(c));
            }
        }
        return stk.pop();
    }
}
