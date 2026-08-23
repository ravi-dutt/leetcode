class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int r=n-1;
        int l=0,maxarea=0;
        while(l<=r)
        {
            int length=Math.abs(r-l);
            int breadth=Math.min(height[l],height[r]);
            int area=length*breadth;
             maxarea=Math.max(area,maxarea);
             if(height[l]<height[r])
             {
                l++;
             }
             else{
                r--;
             }
            }
            return maxarea;
        }
        public static void main(String[] args) {
            Solution water=new Solution();
            int height[]={1,8,6,2,5,4,8,3,7};
            int result =water.maxArea(height);
            System.out.println("Max area="+result);

        }
}          

    
    
