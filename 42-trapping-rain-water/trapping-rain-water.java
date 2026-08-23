class Solution {
    public int trap(int[] height) {
        int lt[]=new int[height.length];
        lt[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            lt[i]=Math.max(height[i],lt[i-1]);
        }
        int rt[]=new int[height.length];
        rt[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rt[i]=Math.max(height[i],rt[i+1]);
        }
        int trap=0;
        int water;
        for(int i=0;i<height.length;i++)
        {
            water =Math.min(lt[i],rt[i]);
            trap+=water-height[i];
        }
        return trap;
    }
}