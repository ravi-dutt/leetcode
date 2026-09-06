class Solution {
    public long subArrayRanges(int[] nums) {
        int []p=new int[nums.length];
        int []n=new int[nums.length];
        int []pg=new int[nums.length];
        int []ng=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            p[i]=-1;
            n[i]=nums.length;
            pg[i]=-1;
            ng[i]=nums.length;
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(nums[i]<=nums[idx])
                {
                    n[idx]=i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        stack.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(nums[i]<nums[idx])
                {
                    p[idx]=i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        stack.clear();
         for(int i=0;i<nums.length;i++)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(nums[i]>=nums[idx])
                {
                    ng[idx]=i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        stack.clear();
         for(int i=nums.length-1;i>=0;i--)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(nums[i]>nums[idx])
                {
                    pg[idx]=i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        long res=0;
        for(int i=0;i<nums.length;i++)
        {
            long min=(long)(i-p[i])*(n[i]-i)*nums[i];
            long max=(long)(i-pg[i])*(ng[i]-i)*nums[i];
            res=res+(max-min);
        }
        return res;
    }
}