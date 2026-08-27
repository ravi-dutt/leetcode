class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k=0;
        int a=1;
        int arr[]=new int[nums.length];        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>0)
           {
            arr[k]=nums[i];
            k=k+2;
           }
           if(nums[i]<0)
           {
            arr[a]=nums[i];
            a=a+2;
          }
        }
    return arr;
    }
}