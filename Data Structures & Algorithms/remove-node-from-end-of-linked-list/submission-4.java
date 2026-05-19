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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        curr=head;
        int remove=count-n;
        if(remove==0)return head.next;
        int i=0;
        while(curr!=null && i<count-1){
            if((i+1)==remove){
                curr.next=curr.next.next;
                break;
            }
            else{
                curr=curr.next;
            }
            i++;
        }
        return head;

    }
}
