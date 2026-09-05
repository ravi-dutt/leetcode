class Solution {
    public int largestRectangleArea(int[] heights) {
        int []p=new int[heights.length];
        int []n=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            p[i]=-1;
            n[i]=heights.length;
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(heights[i]<heights[idx])
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
        for(int i=heights.length-1;i>=0;i--)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(heights[i]<heights[idx])
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
        int max=0;
        for(int i=0;i<heights.length;i++)
        {
            max=Math.max(max,heights[i]*(n[i]-p[i]-1));
        }
        return max;
    }
}