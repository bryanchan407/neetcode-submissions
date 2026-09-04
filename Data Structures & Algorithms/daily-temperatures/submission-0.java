class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> indexes = new Stack<>();
        int[] days = new int[temperatures.length];

        for (int n = 0; n < temperatures.length; n++) {
            if (stack.isEmpty() || temperatures[n] <= stack.peek()) {
                stack.push(temperatures[n]);
                indexes.push(n);
            } else if (temperatures[n] > stack.peek()) {
                while (!stack.isEmpty() && temperatures[n] > stack.peek()) {
                    stack.pop();
                    int i = indexes.pop();
                    days[i] = n - i;
                }
                stack.push(temperatures[n]);
                indexes.push(n);
            }
        }

        return days;
    }
}
