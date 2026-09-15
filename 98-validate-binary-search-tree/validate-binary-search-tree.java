class Solution {
    private Integer last;
    public boolean inorder(TreeNode node)
    {
        if(node==null)
        {
            return true;
        }
        boolean left=inorder(node.left);
        if(!left)
        {
            return false;
        }
        if(last==null)
        {
            last=node.val;
        }
        else 
        {
            if(node.val>last)
            {

            }
            else
            {
                return false;
            }
            last=node.val;
        }
        boolean right=inorder(node.right);
        return right;
    }
    public boolean isValidBST(TreeNode root) {
        last=null;
        return inorder(root);
    }
}