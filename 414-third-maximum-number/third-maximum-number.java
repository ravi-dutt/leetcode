class Solution {
    public int thirdMax(int[] nums) {
        long fm=Long.MIN_VALUE;
        long  sm=Long.MIN_VALUE;
        long  tm=Long.MIN_VALUE;
          int n=0;
          for(int i=0;i<nums.length;i++)
          {
              if (nums[i] == fm || nums[i] == sm || nums[i] == tm) {
                continue;
            }
            n++;
            if(fm<nums[i])
            {
                tm=sm;
                sm=fm;
                fm=nums[i];
            }
            else if(sm<nums[i])
            {
                tm=sm;
                sm=nums[i];
            }
            else if(tm<nums[i])
            {
                tm=nums[i];
            }
          }
          if(n<3)
          {
            return (int) fm;
          }
          return (int)tm;
        
    }
}