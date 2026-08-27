class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int num:hs)
        {
            if(!hs.contains(num-1))
            {
               int c=1;
            while(hs.contains(num+c))
            {
                c++;
            }
            m=Math.max(m,c);
            }
        }
        return m;
    }
}