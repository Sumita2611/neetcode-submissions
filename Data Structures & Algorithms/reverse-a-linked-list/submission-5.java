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

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         List<Integer> list = new ArrayList<>();
//         ListNode temp = head;
//         while(temp != null){
//             list.add(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         int i = list.size()-1;
//         while(temp != null){
//             temp.val = list.get(i);
//             i--;
//             temp = temp.next;
//         }
//         return head;
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
