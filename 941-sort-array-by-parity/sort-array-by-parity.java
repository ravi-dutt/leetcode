class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,
        j=nums.length-1;
        while(i<j)
        {
            int m1=nums[i]%2,
                m2=nums[j]%2;
                if(m1==1&&m2==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                if(m1==0)
                {
                    i++;
                }
                if(m2==1)
                {
                    j--;
                }
        }
        return nums;
    }
}