class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int j=0;
        int c=1;
        int m=1;
     while(j<nums.length-1)
      {
        if(nums[j]<nums[j+1])
        {
          c++;
          j++;
        m=Math.max(m,c);
        }
        else
        {
            c=1;
            j++;
        }
      }  
      return m;
    }
}