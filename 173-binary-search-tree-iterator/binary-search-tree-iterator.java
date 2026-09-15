class BSTIterator {
     List <Integer>al;
     int idx=-1;
    public BSTIterator(TreeNode root) {
      al=new ArrayList<Integer>();
      inorder(root);        
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
    public int next() {
        idx=idx+1;
        return al.get(idx);
    }
    
    public boolean hasNext() {
        return idx<al.size()-1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */