class Solution {
    public int heightChecker(int[] heights) {
        int res[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
           res[i]=heights[i];
        }
        Arrays.sort(res);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(res[i]!=heights[i])
            {
                c++;
            }
        }
        return c;
    }
}