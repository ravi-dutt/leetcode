class Solution {
    public int pivotIndex(int[] nums) {
        int rs=0;
        for(int i=0;i<nums.length;i++)
        {
            rs+=nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++)
        {
            if(ls==rs-nums[i])
            {
                return i;
            }
            ls+=nums[i];
            rs-=nums[i];
        }
        return -1;
    }
}