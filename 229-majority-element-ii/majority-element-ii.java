class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        LinkedList<Integer>ll=new LinkedList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            } 
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>n/3)
            {
                ll.add(i);
            }
        }
        return ll;
    }
}