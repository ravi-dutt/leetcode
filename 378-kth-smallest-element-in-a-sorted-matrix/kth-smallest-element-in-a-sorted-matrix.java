class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                heap.add(matrix[i][j]);
                    if(heap.size()>k)
                    {
                        heap.poll();
                    }
            }
        }
        return heap.peek();
    }
}