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

    public ListNode appendNode(ListNode head,int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return head;
        }

        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        int data;
        ListNode mergedList=null;

        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                data=curr1.val;
                curr1=curr1.next;
                mergedList=appendNode(mergedList,data);
            }else{
                data=curr2.val;
                curr2=curr2.next;
                mergedList=appendNode(mergedList,data);
            }
        }
    
        while(curr1!=null){
            data=curr1.val;
            curr1=curr1.next;
            mergedList=appendNode(mergedList,data);
        }

        while(curr2!=null){
            data=curr2.val;
            curr2=curr2.next;
            mergedList=appendNode(mergedList,data);
        }

    return mergedList;

    }
}