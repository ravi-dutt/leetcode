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
        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        ListNode dummy=new ListNode(0);
        int jump=len-n;
        dummy.next=head;
        ListNode prev=dummy;
        while(jump>0)
        {
            prev=prev.next;
            jump--;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
}