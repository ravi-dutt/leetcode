class Solution {
    public boolean helper(TreeNode node1,TreeNode node2)
    {
        if(node1==null&&node2==null)
        {
            return true;
        }
         if(node1==null||node2==null)
        {
            return false;
        }
        if(node1.val!=node2.val)
        {
            return false;
        }
        boolean res1=helper(node1.left,node2.right);
        if(res1==false)
        {
            return false;
        }
         boolean res2=helper(node1.right,node2.left);
        if(res2==false)
        {
            return false;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        boolean res=helper(root,root);
        return res;
    }
}