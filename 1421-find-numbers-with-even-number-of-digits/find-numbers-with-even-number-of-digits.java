class Solution {
    public int findNumbers(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
           int c=0;
          while(nums[i]>0)
          {
          nums[i]/=10;
          c++;
          }
          if(c%2==0)
          {
            m++;
          }
        }
        return m;
    }
}