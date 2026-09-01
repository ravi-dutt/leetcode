/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String dup(TreeNode node,Map<String,Integer>map,List<TreeNode>res)
    {
        if(node==null)
        {
            return"";
        }
        String key="("+dup(node.left,map,res)+")"+node.val+"("+dup(node.right,map,res)+")";
        map.put(key,map.getOrDefault(key,0)+1);
        if(map.get(key)==2)
        {
            res.add(node);
        }
        return key;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode>res=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        dup(root,map,res);
        return res;
    }
}