/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
        {
            return null;
        }
        Node newHead=new Node();
        Node prev=newHead;
        Stack<Node>stack=new Stack<>();
        stack.add(head);
        while(!stack.isEmpty())
        {
            Node curr=stack.pop();
            curr.prev=prev;
            prev.next=curr;
            if(curr.next!=null)
            {
                stack.add(curr.next);
            }
            if(curr.child!=null)
            {
                stack.add(curr.child);
            }
            prev=curr;
            curr.child=null;
        }
        newHead.next.prev=null;
        return newHead.next;
    }
}