class Solution {
    public int dp(int i,int[]nums,Map<Integer,Integer>map)
    {
        if(i==0)
        {
            return nums[i];
        }
        if(i==1)
        {
            return Math.max(nums[0],nums[1]);
        }
        if(map.containsKey(i))
        {
            return map.get(i);
        }
        map.put(i,Math.max(nums[i]+dp(i-2,nums,map),dp(i-1,nums,map)));
        return map.get(i);
    }
    public int rob(int[] nums) {
     Map<Integer,Integer>map=new HashMap<>();
        return dp(nums.length-1,nums,map);
    }
}