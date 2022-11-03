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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ansHead = null;
        ListNode ansTail = ansHead;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if(list1==null) return list2;
        else if(list2==null) return list1;
        if(temp1.val < temp2.val){
            ansHead = temp1;
            ansTail = temp1;
            temp1=temp1.next;
        }else{
            ansHead = temp2;
            ansTail = temp2;
            temp2 = temp2.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                ansTail.next = temp1;
                ansTail=temp1;
                temp1=temp1.next;
            }else{
                ansTail.next = temp2;
                ansTail=temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1==null) ansTail.next = temp2;
        else ansTail.next = temp1;
        return ansHead;
    }
}
