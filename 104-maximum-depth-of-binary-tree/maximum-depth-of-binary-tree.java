
class Solution {
    int ans;
    public void helper(TreeNode node,int depth)
    {
        if(node==null)
        {
            return;
        }
        ans=Math.max(ans,depth);
        helper(node.left,depth+1);
        helper(node.right,depth+1);
    }
    public int maxDepth(TreeNode root) {
        ans=0;
        helper(root,1);
        return ans;
    }
}