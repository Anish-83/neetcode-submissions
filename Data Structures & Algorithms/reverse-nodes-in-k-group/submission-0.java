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
      if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointerGroupPrev = dummy;

        while (true) {
            // Locate the k-th node of the current group
            ListNode fast = pointerGroupPrev;
            for (int i = 0; i < k && fast != null; i++) {
                fast = fast.next;
            }
            if (fast == null) break; // Less than k nodes left

            // Save the joint point (the start of the next group)
            ListNode joint = fast.next;
            
            // Isolate the current k-group by cutting its connection to the rest of the list
            fast.next = null; 

            // Track the original first node (which will become the tail after reversal)
            ListNode groupTail = pointerGroupPrev.next;

            // Reverse the isolated k-group
            ListNode curr = pointerGroupPrev.next;
            ListNode prev = null; // Setting to null as requested
            while (curr != null) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // At this point:
            // 'prev' holds the new head of the reversed group
            // 'groupTail' holds the tail of the reversed group

            // Connect the previous group's tail to this group's new head
            pointerGroupPrev.next = prev;

            // Connect this group's tail to the joint point
            groupTail.next = joint;

            // Move pointerGroupPrev forward to prepare for the next group
            pointerGroupPrev = groupTail;
        }

        return dummy.next;  
    }
}
