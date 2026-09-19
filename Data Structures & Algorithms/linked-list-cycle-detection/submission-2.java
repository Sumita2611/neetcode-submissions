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
        List<ListNode> vis = new ArrayList<>();
        while(head != null){
            if(vis.contains(head)){
                return true;
            }
            vis.add(head);
            head = head.next;
        }
        return false;
    }
}
