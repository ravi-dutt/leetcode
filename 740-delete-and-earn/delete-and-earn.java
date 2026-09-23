class Solution {
     Map<Integer,Integer>map=new HashMap<>();
    public int deleteAndEarn(int[] nums) {
         int max=nums[0];
        for(int num:nums)
        {
            max=Math.max(num,max);
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+num);
            }
            else
            {
                map.put(num,num);
            }
        }
        int f[]=new int[max+1];
        f[0]=0;
        f[1]=map.getOrDefault(1,0);
        for(int i=2;i<=max;i++)
        {
            f[i]=Math.max(map.getOrDefault(i,0)+f[i-2],f[i-1]);
        }
        return f[max];
    }
}