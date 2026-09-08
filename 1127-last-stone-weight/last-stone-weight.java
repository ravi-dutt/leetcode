class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones)
        {
            heap.add(num);
        }
        while(heap.size()>=2)
        {
            int x=heap.poll();
            int y=heap.poll();
            if(x==y)
            {
                continue;
            }
            else
            {
                heap.add(x-y);
            }
        }
        return heap.size()==1?heap.peek():0;
    }
}