class Solution {
    public int helper(int i,int l,int r,int[] nums, int[] multipliers,int [][] memo)
    {
        if(i==multipliers.length)
        {
            return 0;
        }
        if(memo[i][l]!=0)
        {
            return memo[i][l];
        }
        int vleft=multipliers[i]*nums[l]+helper(i+1,l+1,r,nums,multipliers,memo);
        int vright=multipliers[i]*nums[r]+helper(i+1,l,r-1,nums,multipliers,memo);
        memo[i][l]=Math.max(vleft,vright);
        return memo[i][l];
    }
    public int maximumScore(int[] nums, int[] multipliers) {
        int [][] memo=new int[multipliers.length][multipliers.length];
        return helper(0,0,nums.length-1,nums,multipliers,memo);
    }
}