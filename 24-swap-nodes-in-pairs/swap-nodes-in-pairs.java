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
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        while(head!=null&&head.next!=null)
        {
            ListNode f=head,
            s=head.next;
            f.next=s.next;
            s.next=f;
            p.next=s;
            p=f;
            head=f.next;
        }
        return dummy.next;
    }
}