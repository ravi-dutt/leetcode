class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent=null,
        curr=root;
        while(curr!=null&&curr.val!=key)
        {
            parent=curr;
            if(key<curr.val)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
        if(curr==null)
        {
            return root;
        }
        if(curr.right==null&&curr.left==null)
        {
            if(parent ==null)
            {
                return null;
            }
            if(curr==parent.right)
            {
                parent.right=null;
            }
            else
            {
                parent.left=null;
            }
        }
        else if(curr.left==null||curr.right==null)
        {
            if(parent == null)
            {
                return curr.left!=null?curr.left:curr.right;
            }
            if(curr==parent.right)
            {
                parent.right=curr.left!=null?curr.left:curr.right;
            }
            else
            {
               parent.left= curr.left!=null?curr.left:curr.right;
            }
        }
        else
        {
            TreeNode succ=curr.right;
            TreeNode succP=curr;
            while(succ.left!=null)
            {
                succP=succ;
                succ=succ.left;
            }
            curr.val=succ.val;
            if(succP==curr)
            {
              curr.right=succ.right;
            }
            else
            {
                succP.left=succ.right;
            }
          
        }
        return root;
    }
}