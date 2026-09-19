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
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ArrayList<ListNode> list = new ArrayList<>();
//         ListNode curr = head;
//         while(curr != null){
//             list.add(curr);
//             curr = curr.next;
//         }
//         int removeInd = list.size()-n;
//         if(removeInd == 0){
//             return head.next;
//         }
//         list.get(removeInd-1).next = list.get(removeInd).next;
//         return head;
//     }
// }


// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//        int N = 0;
//        ListNode curr = head;
//        while(curr != null){
//         N++;
//         curr = curr.next;
//        }
//        int removeInd = N-n;
//        if(removeInd == 0){
//         return head.next;
//        }
//        curr = head;
//        for(int i = 0;i < N-1;i++){
//         if((i+1) == removeInd){
//             curr.next = curr.next.next;
//             break;
//         }
//         curr = curr.next;
//        }
//        return head;
//     }
// }



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0,head);
       ListNode left = dummy;
       ListNode right = head;
       while(n > 0){
        right = right.next;
        n--;
       }
       while(right != null){
        left = left.next;
        right = right.next;
       }
       left.next = left.next.next;
       return dummy.next;
    }
}
