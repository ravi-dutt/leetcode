class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r=0;
        int l=0;
        int run=0;
        int min=Integer.MAX_VALUE;
        while(r<nums.length)
        {
            run+=nums[r];
            while(run>=target)
            {
                min=Math.min(min,r-l+1);
                run-=nums[l];
                l++;
            }
            r++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}