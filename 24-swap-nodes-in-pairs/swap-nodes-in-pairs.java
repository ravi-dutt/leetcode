class Solution {
    public void help(ListNode p,ListNode curr)
    {
        if(curr==null||curr.next==null)
        {
            return;
        }
        ListNode f=curr,
        s=curr.next;
        f.next=s.next;
        s.next=f;
        p.next=s;
        help(f,f.next);
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        help(p,head);
        return dummy.next;
    }
}