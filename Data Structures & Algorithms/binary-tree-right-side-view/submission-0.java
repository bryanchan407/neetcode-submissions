/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int len = q.size();
            TreeNode rightmost = null;
            for (int i = 0; i < len; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    rightmost = node;
                    q.offer(node.left);
                    q.offer(node.right);  
                }
            }
            if (rightmost != null) {
                res.add(rightmost.val);
            }
        }
        return res;
    }
}
