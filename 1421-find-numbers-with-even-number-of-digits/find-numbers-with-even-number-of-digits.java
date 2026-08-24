class Solution {
    public int findNumbers(int[] nums) {
       int c=0;
       for(int num:nums)
       {
        int ed=(int)Math.floor(Math.log10(num))+1;
        if(ed%2==0)
        {
            c++;
        }
       }
       return c;
    }
}