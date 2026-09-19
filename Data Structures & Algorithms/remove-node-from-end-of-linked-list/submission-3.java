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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr);
            curr = curr.next;
        }
        int remInd = list.size()-n;
        if(remInd == 0){
            return head.next;
        }
        list.get(remInd-1).next = list.get(remInd).next;
        return head;
    }
}
