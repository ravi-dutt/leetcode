
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>al=new ArrayList<>();
        preorder(al,root);
        return al;
    }
    public void preorder(List<Integer>al,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        al.add(root.val);
        preorder(al,root.left);
        preorder(al,root.right);
    }
}