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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead=new ListNode(0);
        ListNode lessTail=lessHead;
        ListNode greaterHead= new ListNode(-1);
        ListNode greaterTail=greaterHead;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode NodetoInsert=temp;
                temp=temp.next;
                NodetoInsert.next=null;
                lessTail.next=NodetoInsert;
                lessTail=NodetoInsert;
            }
            else{
                ListNode NodetoInsert=temp;
                temp=temp.next;
                NodetoInsert.next=null;
                greaterTail.next=NodetoInsert;
                greaterTail=NodetoInsert;
              
            }
        }
        lessTail.next=greaterHead.next;
        greaterTail.next=null;
        lessHead=lessHead.next;
        return lessHead;
    }
}