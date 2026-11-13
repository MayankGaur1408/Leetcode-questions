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
    public ListNode getMidPoint(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
          if(head==null){
            return true;
          }
          if(head.next==null){
            return true;
          }
         //mid point
         ListNode List2=getMidPoint(head);
         //list1 and list 2 seperate
          ListNode temp=head;
          while(temp.next!=List2){
            temp=temp.next;
          }
          temp.next=null;
         //list2 reverse
         ListNode head2=reverseLL(List2);
         //list 1 and list 2 compare
         ListNode temp1=head;
         ListNode temp2=head2;
         while(temp1!=null && temp2!=null){
             if(temp1.val!=temp2.val){
                return false;
             }
             else{
                temp1=temp1.next;
                temp2=temp2.next;
             }
         }
         // return t or f
         return true;
    }
}