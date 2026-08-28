class Solution {
    public void two(int f,int nums[],List<List<Integer>>res)
    {
        int i=f+1;
        int j=nums.length-1;
        while(i<j)
        {
            int sum=nums[f]+nums[i]+nums[j];
            if(sum>0)
            {
                j--;
            }
            else if(sum<0)
            {
                i++;
            }
            else
            {
                res.add(Arrays.asList(nums[f],nums[i],nums[j]));
                i++;
                j--;
                while(i<j&&nums[i]==nums[i-1])
                {
                    i++;
                }
                 while(i<j&&nums[j]==nums[j+1])
                 {
                    j--;
                 }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]>0)
            {
                break;
            }
            else if(k==0||nums[k]!=nums[k-1])
            {
                two(k,nums,res);
            }
        }
        return res;
    }
}