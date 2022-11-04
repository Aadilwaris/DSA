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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ansHead = head;
        ListNode ansTail = ansHead;
        if(ansHead == null || ansHead.next == null) return head;
        ListNode temp = ansTail.next;
        while(temp!=null){
            if(ansTail.val==temp.val){
                temp = temp.next;
            }else {
                ansTail.next=temp;
                ansTail = ansTail.next;
                temp=temp.next;
            }
        }
        ansTail.next = null;
        return ansHead;
    }
}
