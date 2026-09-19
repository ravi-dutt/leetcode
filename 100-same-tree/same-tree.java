class Solution {
    public boolean helper(TreeNode p,TreeNode q)
    {
        if(p==null&&q==null)
        {
            return true;
        }
        if(p==null||q==null)
        {
            return false;
        }
        if(p.val!=q.val)
        {
            return false;
        }
        boolean left=helper(p.left,q.left);
        if(!left)
        {
            return false;
        } 
        return helper(p.right,q.right);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p,q);
    }
}