class Solution {
    public ListNode help(ListNode prev,ListNode curr)
    {
        if(curr==null)
        {
            return prev;
        }
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        return help(prev,curr);
    }
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
       return help(prev,head);
    }
}