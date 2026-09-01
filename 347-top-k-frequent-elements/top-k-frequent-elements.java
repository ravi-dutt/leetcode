class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {   
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer>heap=new PriorityQueue<>((e1,e2)->map.get(e1)-map.get(e2));
        for(int i:map.keySet())
        {
            heap.add(i);
            if(heap.size()>k)
            {
                heap.poll();
            }
        }
        
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=heap.poll();
        }
        return arr;
    }
}