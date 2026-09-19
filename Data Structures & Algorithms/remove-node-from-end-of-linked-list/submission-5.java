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
//         List<ListNode> nodes = new ArrayList<>();
//         ListNode temp = head;
//         while(temp != null){
//             nodes.add(temp);
//             temp = temp.next;
//         }
//         //nodes.size - 4 - 2 = 2
//         int remInd = nodes.size() - n;
//         if(remInd == 0){
//             return head.next;
//         }
//         // 1 2 3 4
//         // 0 1 2 3
//         nodes.get(remInd - 1).next = nodes.get(remInd).next;
//         // nodes.get(1).next = nodes.get(2),next
//         // 2 -> 4
//         return head;
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        //nodes.size - 4 - 2 = 2
        int remInd = len - n;
        temp = head;
        if(remInd == 0){
            return head.next;
        }
        // 1 2 3 4, remInd = 2
        for(int i = 0;i < len-1;i++){
            if(i+1 == remInd){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } 
        return head;
         }
}
