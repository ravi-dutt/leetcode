class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer>heap=new PriorityQueue<>();
        int bIdx=0;
        while(bIdx<heights.length-1)
        {
            int diff=heights[bIdx+1]-heights[bIdx];
            if(diff<=0)
            {
                bIdx++;
                continue;
            }
            if(ladders>0)
            {
                ladders--;
                heap.add(diff);
                bIdx++;
                continue;
            }
            else if(bricks>0)
            {
                int mindiff=heap.isEmpty()?0:heap.peek();
                if(heap.isEmpty())
                {
                    bricks=bricks-diff;
                }
                else if(diff>mindiff)
                {
                    bricks=bricks-heap.poll();;
                    heap.add(diff);
                }
                else
                {
                    bricks=bricks-diff;
                }
                if(bricks<0)
                {
                    return bIdx;
                }
                bIdx++;
                continue;
            }
            else
            {
                return bIdx;
            }
        }
        return bIdx;
    }
}