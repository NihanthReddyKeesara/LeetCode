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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        ListNode curr=null;
        head=head.next;
        while(ptr1!=null && ptr2!=null){
            ptr1.next=ptr2.next;
            ptr2.next=ptr1;
            if(curr!=null){
                curr.next=ptr2;
            }
            curr=ptr1;
            ptr1=ptr1.next;
            if(ptr1!=null){
                ptr2=ptr1.next;
            }
            
            
        }
        return head;
    }
}