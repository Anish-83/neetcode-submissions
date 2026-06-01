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
    public void reorderList(ListNode head) {
       if(head==null || head.next==null){
        return ;
       } 
       ListNode fast=head;
       ListNode slow=head;
       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode mid=slow;
       ListNode curr=slow.next;

       while(curr.next!=null){
        ListNode newNode=curr.next;
        curr.next=newNode.next;
        newNode.next=mid.next;
        mid.next=newNode;
       }
       slow=head;
       fast=mid.next;
       while(slow!=mid){
            mid.next=fast.next;
            fast.next=slow.next;
            slow.next=fast;
            slow=fast.next;
            fast=mid.next;
       }
       
    }
}
