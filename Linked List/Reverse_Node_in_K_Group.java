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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        int count=0;
        ListNode temp = head;
        ListNode prev = null;
        ListNode tail = head;
        while(count!=k && temp!=null){
            prev = temp;
            temp = temp.next;
            count++;
        }
        if(count<k) return head;
        prev.next = null;
        head = reverse(head);
        ListNode temp2 = head;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        tail=temp2;
        tail.next = reverseKGroup(temp,k);
        return head;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
    }
}
