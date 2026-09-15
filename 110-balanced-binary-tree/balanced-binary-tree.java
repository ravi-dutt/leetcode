class NodeInfo
{
    int h;
    boolean res;
    public NodeInfo(int _h,boolean _res)
    {
        this.h=_h;
        this.res=_res;
    }
}
class Solution {
    public NodeInfo helper(TreeNode node)
    {
        if(node==null)
        {
            return new NodeInfo(-1,true);
        }
        NodeInfo left=helper(node.left);
        if(!left.res)
        {
           return new NodeInfo(-1,false); 
        }
        NodeInfo right=helper(node.right);
        if(!right.res)
        {
           return new NodeInfo(-1,false); 
        }
        if(Math.abs(left.h-right.h)>1)
        {
            return new NodeInfo(-1,false); 
        }
        return new NodeInfo(1+Math.max(left.h,right.h),true); 
    }
    public boolean isBalanced(TreeNode root) {
       if(root==null)
       {
        return true;
       } 
       return helper(root).res;
    }
}