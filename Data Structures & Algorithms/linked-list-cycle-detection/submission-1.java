/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode curr = head;

        if (curr == null) return false;

        while (curr.next != null) {
            if (hs.contains(curr)) return true;
            hs.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
