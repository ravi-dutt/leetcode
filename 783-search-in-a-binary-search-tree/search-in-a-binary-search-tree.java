class Solution {
    public TreeNode help(TreeNode node, int val)
    {
        if(node==null)
        {
            return null;
        }
        if(node.val==val)
        {
            return node;
        }
        if(node.val>val)
        {
            return help(node.left,val);
        }
        return help(node.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return help(root,val);
    }
}